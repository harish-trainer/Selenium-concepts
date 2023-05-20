package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.StackSize;

public class OpeningDiffrentBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://magento.softwaretestingboard.com/");
		
	driver.navigate().to("https://magento.softwaretestingboard.com/");		
	driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
