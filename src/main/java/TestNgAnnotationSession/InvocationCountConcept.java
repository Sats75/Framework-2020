package TestNgAnnotationSession;

import org.testng.annotations.Test;

//Small features and alphabetic order it will be executed (Junit random) -54th minute in video
//Same priority ...then also alphabetic order .Priority 0 ?Negative number also allowed
//With and without priority ...?
public class InvocationCountConcept {

		@Test(invocationCount=10)
		public void searchTest() {
		System.out.println("search text");	
		}
		
		@Test(invocationCount=15)
		public void createuserTest() {
		System.out.println("Create user API");	
	
		
		
	}
}


