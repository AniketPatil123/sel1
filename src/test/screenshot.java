package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
    System.setProperty("webdriver.gecko.driver", "geckodriver");
    
    WebDriver driver = new ChromeDriver();
    //driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    
    driver.get("http://demo.guru99.com/test/delete_customer.php");
    Thread.sleep(2000);
	
	TakesScreenshot TSObj = (TakesScreenshot) driver;
    
    
    File image = TSObj.getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(image, new File("test.png"));
}
}
