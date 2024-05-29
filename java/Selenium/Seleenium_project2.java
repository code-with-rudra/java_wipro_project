package Selenium;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.NoSuchElementException;

public class Seleenium_project2 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a browser name ur choice");
		String browser = input.nextLine();
		 invokeBrowser(browser);
	}
	
	public static void invokeBrowser(String browser) throws InterruptedException {
	 
		switch(browser.toUpperCase()){
			
			case "CHROME" :   
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(20000);
				driver.close();
				break;
			case "FIREFOX" : 
				WebDriver driver1 = new FirefoxDriver();
				driver1.manage().window().maximize();
				driver1.get("https://www.google.com");
				Thread.sleep(20000);
				driver1.close();
				break;
			}
		}
	
	}

