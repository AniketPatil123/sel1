package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridexample {
	
	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		DesiredCapabilities obj = new DesiredCapabilities();
		obj.setBrowserName("chrome");
		obj.setPlatform(Platform.LINUX);
		
		String Surl="http://172.17.0.1:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(Surl),obj);
		driver.get("https://www.simplilearn.com/");
		
	}
	
	

}
