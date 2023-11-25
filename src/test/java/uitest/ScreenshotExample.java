package uitest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		TakesScreenshot Tsobj = (TakesScreenshot) driver;
		File source = Tsobj.getScreenshotAs(OutputType.FILE);
		File target = new File("target/Screenshot2.png");
		FileUtils.copyFile(source, target);

	}

}
