package com.log4.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Testnglistener implements ITestListener  {

	public void onStart(ITestContext context) {
		//ITestListener.super.onStart(context);
		
		
	}
	public void onFinish(ITestContext context) {
		//	ITestListener.super.onFinish(context); says soure required 1.8 or above1.8 
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}
	public void onTestFailure(ITestResult result) {
		
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestStart(ITestResult result) {
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	
	}
	
}
