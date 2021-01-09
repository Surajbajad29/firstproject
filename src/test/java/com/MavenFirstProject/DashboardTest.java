package com.MavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demo.DashboardPage;
import com.demo.TestBase;

public class DashboardTest extends TestBase {

	
	@Test
	public void verifyCource() {
		// @Test(priority = 1)
		dp.verifyCource();
	}
}
