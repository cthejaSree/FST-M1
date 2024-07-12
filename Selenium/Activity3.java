package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
        
        driver.get(" https://v1.training-support.net/selenium/login-form");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");	
			
		driver.findElement(By.xpath("//div/button[contains(text(),'Log in')]")).click();
		
		String message=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
		System.out.println("Login message:" + message);
		driver.quit();
        
	}

}
