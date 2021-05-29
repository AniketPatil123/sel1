package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnno {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("In beforetest");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("In beforemethod");
	}
	@Test
	public void test1() {
		System.out.println("In test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("In test 2");
	}
	@Test(groups = {"Regression"})
	public void test4() {
		System.out.println("In test 4");
	}
	@Test(groups = {"Regression"})
	public void test5() {
		System.out.println("In test 5");
	}


}
