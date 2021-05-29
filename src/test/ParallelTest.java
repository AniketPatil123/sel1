package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void Test1() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.simplilearn.com/");
		
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	
	@Test
	public void Test2() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.simplilearn.com/");
		
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
	}

}
