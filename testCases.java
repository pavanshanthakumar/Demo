package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.ebay.com/");
		
		//Count of the link in the entire page
		//System.out.println("Links in the page"); // Type Syso and enter ctrl+spacebar to automatically get it
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//Count of links in footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		//System.out.println("Links in footer section");
		//System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath("//html//div[@id='hlGlobalFooter']//td[2]/ul[1]")); // these 3 lines of code indicates that get the count of number of links present in the second column of the frame
		//System.out.println("Links in the second column");
		//System.out.println(col.findElements(By.tagName("a")).size()); 
		String beforeClicking = null;
		String afterClicking;
		for(int i = 0; i<col.findElements(By.tagName("a")).size(); i++) {
			
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText()); //indicates that print the names of the links in the second column 
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				beforeClicking = driver.getTitle();				
				//System.out.println(driver.getTitle());
				//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
			afterClicking = driver.getTitle();
			if(beforeClicking !=afterClicking) {
				//boolean abc = driver.findElement(By.xpath("//h1[contains(text(),'Sitemap')]")).isDisplayed();
				//if(abc == true)
				if(driver.getPageSource().contains("Site map"))	
				System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
			}
		}
		//System.out.println(driver.getTitle());
	}

}
