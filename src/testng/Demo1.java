package testng;

import javax.swing.DebugGraphics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
//	@AfterClass
//	public void afterclass() {
//		System.out.println("runnning after class");
//		
//		
//	}
//	
//@BeforeClass
//public void beforeclass(){
//	System.out.println("running beforeclass");
//	
//	
//}
	
//	@BeforeTest
//	public void beforetest() {
//		
//		
//		System.out.println("runnning before test");
//	}
//	@AfterMethod
//	public void aftermethod() {
//		System.out.println("running after method");
//	}
//	
//	@BeforeMethod
//	public void beforeMethod() {
//		
//		
//		System.out.println("running before method");
//	}
	//@Ignore
	
	
		@Test
		@Parameters({"browser","browser1"})

	public void test2(String name1,String name2) {
System.out.println(name1);		
		
		System.out.println("runnning test2");
		System.out.println(name2);
		//Assert.assertFalse(true);
	}
	
	/*@Test(groups="reg")
	public void test1() {
		
		
		
		System.out.println("running test1");
		//Reporter.log("ruunig test",true);
		
		
	}
*/	
	
	
	
	
	
	
	

}
