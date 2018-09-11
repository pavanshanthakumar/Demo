import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\pavan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		
		////tagname[@attribute='value'] - xpath syntax
		
		/*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abc.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		//tagname[attribute='value'] - css syntax
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc.com");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
	}

}
