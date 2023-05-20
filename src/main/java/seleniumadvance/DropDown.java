package seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0dj3yi2qnyynr6xz1uk1pscaj8619.node0");
		Thread.sleep(3000);
		Select dropdown=new Select(driver.findElement(By.className("ui-selectonemenu")));
		
		dropdown.selectByVisibleText("Playwright");
	}

}
