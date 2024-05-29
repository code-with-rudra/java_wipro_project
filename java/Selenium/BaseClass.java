package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static WebDriver driver=null;
	//open browser
		public static void invokeBrowser(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
		}
		//close browser method
		public static void closeBrowser() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.close();
		}

}
