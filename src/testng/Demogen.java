package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demogen {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("running before suite");
		
		
	}
	@AfterSuite
	public void aftersuite() {
		
		
		System.out.println("running after suite");
	}
	
	
	@AfterTest
	public void aftertest() {
		
		
		System.out.println("runnng after test");
	}
	
	
	@BeforeTest
	public void beforetest() {
		
		
		System.out.println("runnning before test");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		
		
		System.out.println("running before class");
		
		
		
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("runnning after class");
		
		
	}

}
