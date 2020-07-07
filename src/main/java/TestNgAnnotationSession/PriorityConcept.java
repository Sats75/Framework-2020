package TestNgAnnotationSession;

import org.testng.annotations.Test;

public class PriorityConcept {

@Test(priority = 1)
public void aTest() {
System.out.println("A test");
}

@Test(priority = 2)
public void bTest() {
System.out.println("B test");

}

@Test(priority = 3)
public void ctest() {
System.out.println("C test");

}

@Test
public void dtest() {
System.out.println("d test");

}
}
