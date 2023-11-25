package testng;


import org.testng.annotations.Test;

public class LoanTest extends BaseClass{
	
	
	
	@Test
	public void tc01_Homeloantest() {
		System.out.println("Home Loan Test");
	}
	
	@Test(enabled=true)
	public void tc02_Carloantest() {
		System.out.println("Car Loan Test");
	}
	
	@Test(groups= {"sanity"})
	public void tc00_Personalloantest() {
		System.out.println("Personal Loan Test");
	}

}
