package jenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	 public static WebDriver driver;
	 public static String driverPath = "C:/tomcat_issue/";
	@BeforeTest
	public void beforeTest(){		
				System.out.println("launching chrome browser");
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		
	}
	
	@Test
	public void test(){		
				driver = new ChromeDriver();
				driver.navigate().to("http://google.com");
				
	}
	
	@AfterTest
	public void afterTest(){
		
		System.out.println(driver.getTitle());
		driver.close();
		}
	}
	
	

	
