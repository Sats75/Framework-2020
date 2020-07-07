package TestNgAnnotationSession;

//Pre cond --> Test + Assert -- Post steps
//BeforeAnnotations -- @Test ---After Annotations
//Annotations can also be imported 
//Suite, test ,class
//Before test,Before class .After class,Aftertest = Sequence
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	/**
	 * before suite method     //1st priority
before test method
before class method

before method method
test 1
after method

before method method
test 2
after method

after class method
after test method
after suite method
PASSED: test1
PASSED: test2

BS
BT
BC 
BM t1 AM
BM t2 AM
AC
AT
AS
*/
	

	
	
//1	@BeforeSuite

	public void beforeSuite() {
		System.out.println("Prepare TD");//Prepare TD
	}

//2	@BeforeTest
	public void beforeTest() {
		System.out.println("Check DB ");//Chk DB connection

	}

//3	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch browser");//Launch browser and url
	}

//4	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login to application");//Login to app
	}

//5 
	@Test //The moment i write @Test only then TestNg will be visible in right click
	public void test1() {
		System.out.println("Check user details"); //Chk user details
	}

	@Test
	public void test2() {
		System.out.println("Check whether user id is created or not");//Chk user id created or not
	}
	
	@Test
	public void test3() {
		System.out.println("Check all");//Chk user id created or not
	}
	
	@Test
	public void test4() {
		System.out.println("Check all credentials");//Chk user id created or not
	}
	
	
	
	
	
	
//6	and 9 @AfterMethod
	 public void afterMethod() {
		System.out.println("before method method"); //Logout
}
	
//10	@AfterClass
	public void afterClass() {
		System.out.println("Close the browser"); //Close the browser	
	}

//11	@AfterTest
	public void afterTest() {
		System.out.println("Disconnet the DB"); //Disconnect the db
	}

//12	@AfterSuite
	 public void afterSuite() {
		System.out.println("after suite method");
 }
	
	
}
