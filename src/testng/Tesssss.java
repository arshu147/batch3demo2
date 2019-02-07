package testng;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;
import java.util.Set;

import org.testng.Assert;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Listt.class)
public class Tesssss 	{
	@Test
	public void run(Method m) {
		
		System.out.println(m.getName());
	Assert.fail();
		System.out.println("runnning test method");
		
	}
	
	@AfterMethod
	public void report(ITestResult r) {
		
		//System.out.println(r.);
		System.out.println(r.getHost());
		
		System.out.println(r.isSuccess());
		
		System.out.println(r.getMethod().getMethodName());
		
		if(r.getStatus()==ITestResult.SUCCESS) {
		System.out.println("test passed");
		
		}else {
			
			System.out.println("test failed");
			
			
		}
	}
	
	
	
	
	

}
	
