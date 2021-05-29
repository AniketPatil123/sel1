package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	//WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//WebElement table=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr"));
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Rows in the table are "+row.size());
		
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Rows in the table are "+col.size());
		
		WebElement cell=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(cell.getText());
		
WebElement location = driver.findElement(By.xpath("//h2[text()='HTML Table - Add a Border']"));
        
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        
        obj.executeScript("arguments[0].scrollIntoView();", location);
		
	}
	
	
	//table[@id='customers']

}
