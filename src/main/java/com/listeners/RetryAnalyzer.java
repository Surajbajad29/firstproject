package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count = 0;
	int maxLimit = 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count < maxLimit) {
			System.out.println("Retrying failed test case for count" + count);
			count++;
			return true;
		} else {
			System.out.println("Skip retrying failed test case as max limit reached as" + maxLimit);
			count++;
			return false;
		}
	}

}
