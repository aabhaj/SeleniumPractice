package textPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateDemo {
static WebDriver driver;

 public static void main(String[] args) throws InterruptedException {
	 
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("http://demo.automationtesting.in/Register.html");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@ placeholder = \"First Name\"]")).sendKeys("AAAA");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@ placeholder = \"Last Name\"]")).sendKeys("JJJJJ");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath( "//*[@ ng-model=\"Adress\"]")).sendKeys("Pune");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@ type=\"email\"]")).sendKeys("aaa.gggg@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@value=\"FeMale\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
	 
	//For drop down
	 WebElement skillDropdown= driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
	 Select skill =new Select(skillDropdown);
	 skill.selectByVisibleText("C++");
	 
	 WebElement countryDropdown= driver.findElement(By.xpath("//*[id=\"countries\"]"));
	 Select country = new Select(countryDropdown);
	 country.selectByValue("India");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	 
	 
	 
	 Thread.sleep(5000);
	 driver.quit();
 }

}
