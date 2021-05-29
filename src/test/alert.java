package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        
        WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        
         driver.findElement(By.name("cusid")).sendKeys("12345");
         driver.findElement(By.name("submit")).submit();
         
         Alert obj = driver.switchTo().alert();
         
         
         System.out.println("Eror " + obj.getText());
         
         
         obj.accept();
         //obj.dismiss();
	}

}
