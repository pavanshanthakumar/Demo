package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i<count;i++) {
		//	driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		//Alternate method of using Radio Button (i.e, without using value attribute example "MILK"
		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		
		if(text.equals("Cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
	}

	}
}
