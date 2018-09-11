package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https:path2usa.com/travel-companions");
		//August 20
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
						
		}
		
		
		List <WebElement> dates = driver.findElements(By.className("day"));
		//Grab the common attribute , put it into list and iterate
		int count = driver.findElements(By.className("day")).size();
		
		for(int i = 0; i<count; i++) {
		String text = driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("9")) {
			driver.findElements(By.className("day")).get(i).click();
			
		}
		}
	}

}
