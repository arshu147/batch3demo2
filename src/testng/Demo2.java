package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends Demogen{

	


	@Test
	public void run() {
		
		
		
		System.out.println("test 2 running");
		Reporter.log("ruunig test 2",true);
	}
}
