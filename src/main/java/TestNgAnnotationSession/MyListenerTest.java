package TestNgAnnotationSession;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenerTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("test case started--->" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is successful--->" + result.getName());
		

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed--->" + result.getName());
		System.out.println("taking screenshot...");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test case is skipped--->" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

	public void onStart(ITestContext context) {}

	public void onFinish(ITestContext context) {}
	
}

	