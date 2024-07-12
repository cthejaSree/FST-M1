package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			// Go to webpage
			driver.get("https://v1.training-support.net");
			//print the title of the image
			 System.out.println(driver.getTitle());
            driver.findElement(By.id("about-link")).click();
            System.out.println(driver.getTitle());
            driver.quit();
            
     }
}