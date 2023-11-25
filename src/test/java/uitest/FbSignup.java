package uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement newaccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newaccount.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Naimesh");
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Rana");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("abc@gail.com");
		
		WebElement reemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reemail.sendKeys("abc@gail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Abc@1234");
		
		WebElement day = driver.findElement(By.id("day"));
		Select ddday = new Select(day);
		ddday.selectByValue("8");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select ddmonth = new Select(month);
		ddmonth.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		Select ddyear = new Select(year);
		ddyear.selectByVisibleText("1994");
		
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value=2]"));
		gender.click();
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement mon:months) {
			System.out.println("Month is " + mon.getText());
		}
		
		
		List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']/option"));
		
		for(WebElement yr:years) {
			System.out.println("Year is " + yr.getText());
		}
		
		driver.close();
				
				
		
		
		
		
		
		


	}

}
