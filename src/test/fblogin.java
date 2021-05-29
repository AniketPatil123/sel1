package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fblogin {
	
	WebDriver driver;
	public static void main(String[] args) {
		fblogin obj=new fblogin();
		obj.setup();
		//obj.login();
		//obj.signup();
		obj.contain();
	}
	
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	
	public void login() {
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement button=driver.findElement(By.xpath("//*[@name='login']"));
		
		username.sendKeys("abc@xyz.com");
		pass.sendKeys("test");
		button.click();
	}
	
	public void signup() {
		
		WebElement newaccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
		newaccount.click();
		WebElement dayDropdown=driver.findElement(By.xpath("//*[@title='Day']"));
		
		Select day=new Select(dayDropdown);
		day.selectByValue("5");
		//day.selectByIndex(3);
		//day.selectByVisibleText("1");
		
		WebElement malegender=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		malegender.click();
		
		
		//input[@type='radio' and @value='2']//preceding::input[1]
		//input[@type='radio' and @value='1']//following::input[1]
	}
	
	public void contain() {
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),'friends')]"));
		String texts=text.getText();
		System.out.println(texts);
		
		//*[starts-with(text(),'Connect')]
	}

}
