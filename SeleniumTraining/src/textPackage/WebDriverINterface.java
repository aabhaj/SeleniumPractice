package textPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class WebDriverINterface {
	
	static WebDriver driver;
	static String browser = "ff";
	
	public static void main(String[] args) throws InterruptedException 
	
	{			
			
		if (browser.equalsIgnoreCase("FF")){
				driver = new FirefoxDriver(); }
		else if (browser.equalsIgnoreCase("Chrome"))	{	
			    driver = new ChromeDriver(); }
		else		{
			    driver = new InternetExplorerDriver(); }
			
		driver.get("https://www.google.com/#spf=1631794691786");
		Thread.sleep(10000);
			driver.quit();
		}
	}
