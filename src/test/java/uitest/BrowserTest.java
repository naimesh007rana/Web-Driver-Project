package uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		loginlink.click();
		
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.name("user_pwd"));
		password.sendKeys("Abc@1234");
		
		WebElement remember = driver.findElement(By.id("remember-me"));
		remember.click();
		
		WebElement loginbutton = driver.findElement(By.name("btn_login"));
		loginbutton.click();
		
		WebElement errormessage = driver.findElement(By.id("msg_box"));
		System.out.println("Error message is : "+ errormessage.getText());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Numbers of link in page are "+links.size());
		
		
		
	}

}

