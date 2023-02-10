package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listerners implements ITestListener {
	
	
	 @Override
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test case passed");
	 }
	 
	 @Override
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test case failed");
	 }
	 
	 @Override
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test case skipped");
	 }
	 
	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.println("Test case skipped");
	 }
	 
	 @Override
	 public void onStart(ITestContext result) {
		 System.out.println("before everything");
	 }
	 
	 @Override
	 public void onFinish(ITestContext result) {
		 System.out.println("after everything");
	 }

}
