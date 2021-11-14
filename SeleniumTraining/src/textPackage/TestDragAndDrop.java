package textPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {
	static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Droppable\"]")).click();
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Thread.sleep(2000);
		act.dragAndDrop(source, target).perform();
		
		
		Thread.sleep(8000);
		driver.quit();
	}
}
