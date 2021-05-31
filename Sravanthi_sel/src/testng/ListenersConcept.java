package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersConcept implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("scrit onTestStart: "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("scrit pass: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("scrit onTestFailure: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("scrit skipped: "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("scrit onTestFailedButWithinSuccessPercentage: "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("scrit onStart: "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("scrit onFinish: "+context.getName());
		
		
	}
	

}
