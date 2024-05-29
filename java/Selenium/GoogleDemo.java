package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
 
public class GoogleDemo extends BaseClass{
 
	public static void main(String[] args) throws InterruptedException {
		// call the invoke browser
		invokeBrowser("Edge");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximum waiting period -10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");//2 secs
		//Identify the text area
		WebElement searchArea = driver.findElement(By.name("q"));
		//Performing the action - Enter the value
		searchArea.sendKeys("Selenium");
		searchArea.sendKeys(Keys.ENTER);//click on enter from the keyboard
		Thread.sleep(5000);
		
		//String s = driver.getPageSource();
		//System.out.println(driver.getPageSource());//page source displayed
		//System.out.println(s);
		System.out.println(driver.getTitle());//print the title
		System.out.println(driver.getCurrentUrl());//print the url
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println(driver.getPageSource());
		
		WebElement uName=driver.findElement(By.id("username"));
		WebElement uPwd=driver.findElement(By.name("pw"));
		
		//Action
		uName.sendKeys("Admin");
		driver.findElement(By.name("pw")).sendKeys("Admin123");
		
		//Login btn click xpath-> //tagName[@attribute='value']
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='Login']"));
		loginBtn.click();
		
		//capture the error
		//closeBrowser();
		
	}
 
}
