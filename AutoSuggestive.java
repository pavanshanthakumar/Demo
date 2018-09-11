package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Condition we are looking for --------->>>>>>>>>
//Enter the letter BENG
//Verify if Airport option is displayed in the suggestive box
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://ksrtc.in/oprs-web");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		//Javascript DOM can extract hidden elements
		//Because selenium cannot identify hidden elements - (AJAX implementation)
		//investigate the properties of object if it have any hidden text
		
		//API called JavascriptExecutor, if you can use this method in your selenium java you can able to write JAVASCRIPT DOM steps as well
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		int i = 0;
		//BENGALURU INTERNATION AIPORT - we are looking for 
		while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN); //Does keydown at first
			//Grabs the text which is present in the edit box again 
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10) {
				break;
			}
		}	
			if(i>10) {
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found");
			}
	}
}
