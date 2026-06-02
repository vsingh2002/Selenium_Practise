package selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vishal");
		driver.findElement(By.name("inputPassword")).sendKeys("singh123");
		driver.findElement(By.className("signInBtn")).click();
		WebElement msg = driver.findElement(By.cssSelector("p.error"));

		System.out.println("Message is :" + msg.getText());
		// System.out.println("");

	}

}
