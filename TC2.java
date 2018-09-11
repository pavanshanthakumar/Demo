import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "F:\\pavan\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		/*driver.get("http:\\www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://gmail.com");
		driver.navigate().back();*/
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("abc.com");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click(); //error
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.close();
	}

}
