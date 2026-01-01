package com.api.listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


 
public class Testlisteners implements ITestListener {

	public static final Logger logger = LogManager.getLogger(Testlisteners.class);

	public void onTestStart(ITestResult result) {
		logger.info("Test Started"+result.getMethod().getMethodName());
		logger.info("Description"+result.getMethod().getDescription());
		
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Passed"+result.getMethod().getMethodName());
		//logger.info("Description"+result.getMethod().getDescription());

		}

	public void onTestFailure(ITestResult result) {
		logger.error("Failed"+result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onStart(ITestContext context) {
		logger.info("Test Suite Started!!");
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite Completed !!");

	}

}
