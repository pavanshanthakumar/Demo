package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Pavan\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.makemytrip.com/");
		System.out.println("Before clicking on Multi city Radio Button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed()); // xpath of return date
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
		System.out.println("After clicking on Multi city Radio Button"); // xpath of multicity
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		
		
	}

}

//Source code for different functionalities
/*System.out.println("Before clicking on Multi city Radio Button");
System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

System.out.println(" After clikcing on Multi city Radio button");

driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();

driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

int i=0;

while(i<5)

{

driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

i++;

}

//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

Thread.sleep(3000L);

//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

//If you want to validate the object which is present in web page or code base

int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

if (count==0)

{

System.out.println("verified");

}*/