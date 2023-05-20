package seleniumBasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dynamicgrid.xhtml");
		List<Integer> values = new ArrayList<Integer>();
		
	List<WebElement> activities = driver.findElements(By.xpath("//td[4]"));
	
	for (WebElement element : activities) {
		String activityValue = element.getText();
		values.add(Integer.parseInt(activityValue));
	}
	
	System.out.println(values);
	
	Integer leastvalue = Collections.min(values);
	
	System.out.println("the least value is"+leastvalue+".....");
	
	WebElement nameOfLeastActivity = driver.findElement(By.xpath("//td[text()='"+leastvalue+"']/parent::tr/td[1]"));

		System.out.println(nameOfLeastActivity.getText());
		
	}

}
