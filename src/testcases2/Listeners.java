package testcases2;

import org.testng.IClassListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test Folder successfully executed is" +result.getName() );
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test Folder going to be executed is" +result.getName() );
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped is" +result.getName() );

		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case gonna be executed is " +result.getName() );

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case succesfully executed is " +result.getName() );
		
	}
}
