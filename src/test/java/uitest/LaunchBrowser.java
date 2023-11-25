package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://simplilearn.com/");
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://simplilearn.com/");
	}

}
