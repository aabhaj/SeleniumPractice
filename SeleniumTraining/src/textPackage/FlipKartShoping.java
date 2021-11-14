package textPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartShoping {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		Actions act = new Actions(driver);
		
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.xpath(" //*[@class=\"_1_3w1N\"]"))).perform();
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@alt=\"Electronics\"]"))).perform();
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[text()=\"Bluetooth Headphones\"]"))).perform();
		System.out.println("HP are mouse hovered from menu ");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Bluetooth Headphones\"]")).click();
		System.out.println("HP are clicked from menu ");
		
		 Thread.sleep(5000);
		 driver.quit();
		
		
		
		
		
	}

}
