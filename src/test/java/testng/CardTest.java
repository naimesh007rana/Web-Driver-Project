package testng;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{
	
	@Test(groups= {"sanity"})
	public void TC01_Creditcardtest(){
		System.out.println("Credit Card Test");
		
	}

}
