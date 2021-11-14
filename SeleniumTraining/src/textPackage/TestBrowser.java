package textPackage;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		
		// ChromeDriver driver1 = new ChromeDriver(); Responsible to launch the driver
		
		
	Thread.sleep(5000);
		driver.quit();
	}
}
