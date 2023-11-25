package uitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Abc@1234");
		
		WebElement Loginbtn = driver.findElement(By.name("login"));
		Loginbtn.click();
		

	}

}
