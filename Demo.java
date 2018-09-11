import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\pavan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		
		//System.out.println(driver.getTitle());
		//driver.navigate().to("http://gmail.com");
		//driver.navigate().back();
		
		/*driver.findElement(By.id("email")).sendKeys("cricmania25@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("cric@123$");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		/*driver.findElement(By.cssSelector("#email")).sendKeys("cricmania25@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("cric@123$");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.close();*/
		driver.findElement(By.xpath("//a[@class='gb_P'][contains(text(),'Images')]")).click(); //using chropath plugin I got this xpath
		
		
		
		
	}

}
