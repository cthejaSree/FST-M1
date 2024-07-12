package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Go to webpage
		driver.get("https://google.com");
		//print the title of the image
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
