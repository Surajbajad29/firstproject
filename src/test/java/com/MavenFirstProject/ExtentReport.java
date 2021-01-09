package com.MavenFirstProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;



public class ExtentReport implements IReporter{
	
	
	private ExtentReports extent;

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		extent = new ExtentReports(outputDirectory + File.separator + "Extent.html", true);
		
		for (ISuite suite : suites){
			 Map<String, ISuiteResult> result = suite.getResults();
			 
			 for (ISuiteResult r : result.values()){
				 ITestContext context = r.getTestContext();
				 
				 try{
					 buildTestNodes(context.getPassedTests(),LogStatus.PASS);
					 buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
					 buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
				 } catch (Exception e) {
					// TODO: handle exception
					 e.printStackTrace();
				}
			 }
			
		}
		
		extent.flush();
		extent.close();
		
	}



	private void buildTestNodes(IResultMap tests, LogStatus status) throws Exception {
		// TODO Auto-generated method stub
		ExtentTest test;
		
		
		if(tests.size() > 0){
			for (ITestResult result : tests.getAllResults()){
				test = extent.startTest(result.getMethod().getMethodName());
				
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));
				
				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);
				
				if (result.getThrowable() != null){
					test.log(status, result.getThrowable());
					} else if (result.getStatus()==ITestResult.FAILURE){
						
						test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());//to Add in extent report
						test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable());//to Add error/exception in extent  report
						
						
						String screenshotPath = Demo1.getScreenshot(Demo.driver, result.getName());
						test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));// to add screenshot in extent report
					//	test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));// to add screencase/video in extent report
					}else {
						test.log(status, "Test " + status.toString().toLowerCase()
								+ "ed");
					}
					extent.endTest(test);

				}
				
			}
		}
	
	


	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}



	
}
