
package selenium_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='one']"));
		System.out.println("Before Clicking :" + checkbox.isSelected());
		driver.findElement(By.xpath("//input[@value='one']")).click();
		System.out.println("After clicking :" + checkbox.isSelected());
		// Count number of checkboxes present
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='checkboxes']"));
		System.out.println("Number of Checkboxes present :" + checkboxes.size());
		driver.quit();
	}

}
