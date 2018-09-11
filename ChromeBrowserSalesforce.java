import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\pavan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http:\\www.facebook.com");
		
		System.out.println(driver.getTitle());
		driver.navigate().to("http://gmail.com");
		driver.navigate().back();
		
		driver.findElement(By.id("email")).sendKeys("cricmania25@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("cric@123$");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("abc.com");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click(); //error
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div#error.loginError")).getText(); //it will be (div.error.loginError) present in the bottom of the console box when you spy for that element (i.e., present at right side corner of all texts)
		
		
		
		
		

	}

}
