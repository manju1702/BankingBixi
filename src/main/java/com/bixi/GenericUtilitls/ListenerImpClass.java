package com.bixi.GenericUtilitls;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImpClass extends BaseClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("SDET-52");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("Bixi");

		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base-Browser", "chrome");
		report.setSystemInfo("url", "http://rmgtestingserver/domain/Online_Banking_System/");
		report.setSystemInfo("Reporter Name", "Miss Manju Sahu");
	}
	public void onTestStart(ITestResult result) 
	{
		// Starting of the report
		String MethodName = result.getMethod().getMethodName();
		test = report.createTest(MethodName);
		Reporter.log(MethodName + "-- Testscript execution strat-- ");

	}
	public void onTestFailure(ITestResult result) 
	{
		String FS = result.getMethod().getMethodName();
		String FSscript = FS + new JavaUtils().systemDateInFormate();
		test.addScreenCaptureFromPath(FSscript);

		WebDriverUtils.getScreenshot(BaseClass.sdriver, FSscript);

		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, FSscript + "--> FAILED");
		Reporter.log(FSscript + "--->Test-script execution failed<--");
	}

	public void onTestSkipped(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName + "---SKIPPED");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(MethodName + " Testscript execution skipped ");
		
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName + " PASSED ");

		Reporter.log(MethodName + "--->Test-script execution passed<--");

	}

	public void onFinish(ITestContext context) 
	{
		// consollidate all the report report and clean older report

		report.flush();

	}

}
