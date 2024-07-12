package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity16 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page is:" + driver.getTitle());
		WebElement Username= driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
		WebElement password =driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
		WebElement Confirmpassword =driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
		WebElement Email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		Username.sendKeys("sireesha");
		password.sendKeys("1234abcd");
		Confirmpassword.sendKeys("1234abcd");
		Email.sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//div//button[contains(text(),'Sign Up')]")).click();
		String Success_message= driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Success message is:" + Success_message);
		driver.quit();
		
	}
}
