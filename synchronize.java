package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //This line is written because 23rd line in this code won't execute properly why because means it will just look after that xpath just after loading that page, so that it will throw error and won't suspect the element. That's the reason we are providing wait for just 5 seconds until that page loads then suspect the element
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB); //Handling or switch to another tab element
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);  //Clicks on Enter button after filling out the details in the particular page to move onto another page
		
		//driver knows about the above 5 seconds, 'd' knows about 20 seconds
		
		// Now handling Explicit Wait
		
		WebDriverWait d= new WebDriverWait(driver, 20); //Indicates that passing driver object and 5 seconds wait time for it, wherever you use 'd' then 5 seconds wait time is applicable
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-Hotel')]")));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'New-York-Hotels-Hotel')]")));
		
		//Thread.sleep(5000L); //Even this works if we need to wait to certain amount of seconds to load the result which we are looking for, but this is not recommended for the use
		
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Hotel')]")).click(); //contains is used because it is used as a regular expression (because xpath i.e,. href is too long to write in the code)
		
		
		
		
		
	}

}
