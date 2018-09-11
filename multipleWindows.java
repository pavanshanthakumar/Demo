package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.findElement(By.id("cookie-use-link")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//input[@value='Log In']")).click(); //Performing actions on the child window
		
		driver.switchTo().window(parentid);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); //Performing action on parent window after traversing back from child window
		
		
	}

}
