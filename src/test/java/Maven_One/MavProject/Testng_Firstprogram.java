package Maven_One.MavProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Firstprogram {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}
	@Test
	private void testOne() {
		System.out.println("test");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("afterclass");
	}
	@AfterTest
	private void aftertest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	private void afterSuite() {
		System.out.println("aftersuite");
	}
	
}
