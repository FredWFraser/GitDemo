package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("This is coming from the listener, test has passed!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is coming from the listener, test has failed!" + result.getName());
		
	}
	
	

}
