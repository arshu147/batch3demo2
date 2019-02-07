package testng;

import org.testng.annotations.Test;

public class DataMain {
	@Test(dataProvider="dataprov",dataProviderClass=Dataprov.class)
	public void datapro(String one,String two) {
		
		System.out.println(one);
System.out.println(two);		
		
	}
}
