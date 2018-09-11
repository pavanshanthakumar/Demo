package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); //Used to maximize the window
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver); //Need to pass the driver object into the action class
		
		//Object 'a' has powerful capabilities of handling the webpages with those interactions
		
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); //build() is used here because, once the build() is used then this step is ready to use & if you want to perform that action then use perform() so that the action will be performed
	
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobiles").doubleClick().build().perform();
		
		//Here keyDown(keys.SHIFT) is used to change the lowercase of the character into uppercase also doubleClick() is used to select the entered text 
		
		//Moves to Specific Element
		a.moveToElement(move).contextClick().build().perform(); //If you want to right click on any particular element then use contextClick() action class
		
		
		
	}

}
