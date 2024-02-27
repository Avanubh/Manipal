package Axis_TestNGG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution is started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase is success");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase is Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
	}

}
