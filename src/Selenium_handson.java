import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/gopal/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		//driver.close();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//driver.findElement(By.id("inputPassword")).sendKeys("password");
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

	}
}
