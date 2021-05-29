package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Listeners(Listenerdemo.class)
public class logintest {
	
	static WebDriver driver;
	XSSFWorkbook Workbook;
    XSSFSheet sheet1;
	
	
		@BeforeTest
		public void setup() throws IOException {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			driver=new ChromeDriver();
			driver.get("https://www.simplilearn.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			FileInputStream fis = new FileInputStream("exceldata.xlsx");
	        
	        Workbook = new XSSFWorkbook(fis);
	        sheet1 = Workbook.getSheetAt(0);
		}
		
		@Test
		@Parameters({"uname","pass"})
		public void login(String uname,String pass) throws InterruptedException {

			WebElement loginlink= driver.findElement(By.linkText("Log in"));
			loginlink.click();
			
			WebElement username=driver.findElement(By.name("user_login"));
			uname=sheet1.getRow(0).getCell(0).getStringCellValue();
			username.sendKeys(uname);
			
			WebElement password=driver.findElement(By.name("user_pwd"));
			pass=sheet1.getRow(0).getCell(1).getStringCellValue();
			password.sendKeys(pass);
			
			/*WebElement chkbox= driver.findElement(By.id("remember-me"));
			chkbox.click();*/
			
			WebElement login=driver.findElement(By.name("btn_login"));
			login.click();
			Thread.sleep(5000);
			WebElement err=driver.findElement(By.id("error_box"));
			String text=err.getText();
			System.out.println(text);
			String actual="Please enter a valid email address";
			/*if(text.equals(actual)) {
				System.out.println("pass");
			}
			else
				System.out.println("fail");*/
			
			
			//purposeful
			//Assert.assertEquals(text, actual);
			
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
		}
		
	

}
