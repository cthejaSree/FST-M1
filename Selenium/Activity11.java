package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11 {
     public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://v1.training-support.net/selenium/dynamic-controls");
    	 WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
    	 checkbox.click();
    	 System.out.println("checkbox is selected:" + checkbox.isSelected());
    	 checkbox.click();
    	 System.out.println("checkbox is selected:" + checkbox.isSelected());
    	 driver.quit();
    	 
     }
}
