package TestNgAnnotationSession;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {


	@Test(expectedExceptions = ArithmeticException.class)
	public void test1(){
	System.out.println("ArithmeticExceptionMethod");
	int i = 9/0;
	//it will terminate but it will pass
	//System.out.println("ABC");

	}

}
