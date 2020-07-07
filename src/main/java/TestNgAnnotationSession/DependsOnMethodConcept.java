package TestNgAnnotationSession;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {


	@Test	
	public void login() {
		System.out.println("login");
	}	
	@Test(dependsOnMethods="login")
	public void home() {
	System.out.println("home");
	}
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("search");

	
		
		
	}

}
