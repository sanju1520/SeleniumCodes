package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case started");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case fail wth success percent");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname + ": test case with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		String testname=context.getName();
		System.out.println(testname + ": test on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		String testname=context.getName();
		System.out.println(testname + ": test on finished");
	}
	

}
