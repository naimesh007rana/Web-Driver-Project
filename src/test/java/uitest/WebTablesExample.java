package uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	//total number of row in table
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("total number of rows in tables are:" + row.size());
		
		//total number of columns in table
				List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
				System.out.println("total number of columns in tables are:" + column.size());
				
		//from company name print contact & country
		String CompanyName = "Island Trading";
		
		//Solution 1
		for(int i=2;i<=row.size();i++) {
		
		WebElement company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" +i+ "]/td[1]"));
		
		if(company.getText().equals(CompanyName)) {
			
			WebElement contact = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" +i+ "]/td[2]"));	
			WebElement country = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" +i+ "]/td[3]"));
			
			System.out.println("contact is:"+ contact.getText());
			System.out.println("country is:"+ country.getText());
		}
				

	}
		
		//Solution 2
		
		WebElement contact1 = driver.findElement(By.xpath("//td[text()='" + CompanyName + "']/following-sibling::td[1]"));
		WebElement country1 = driver.findElement(By.xpath("//td[text()='" + CompanyName + "']/following-sibling::td[2]"));
		System.out.println("contact is:"+ contact1.getText());
		System.out.println("country is:"+ country1.getText());
}
}
