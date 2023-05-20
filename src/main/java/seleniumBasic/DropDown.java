package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.model.FrameworkField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Harish-Raj java selenium";
		
		String[] e = string.split("-");
		
		for (String string2 : e) {
			System.out.println(string2);
		}
	}
}
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		/*
		 * Select dropdown = new Select(driver.findElement(By.id("oldSelectMenu")));
		 * 
		 * dropdown.selectByIndex(5); dropdown.selectByValue("10");
		 * dropdown.selectByVisibleText("Green");
		 * 
		 * WebElement selectedoption = dropdown.getFirstSelectedOption();
		 * System.out.println(selectedoption);
		 * 
		 * Select multipleselect = new Select(driver.findElement(By.id("cars")));
		 * 
		 * if(multipleselect.isMultiple()) { multipleselect.selectByVisibleText("Opel");
		 * multipleselect.selectByVisibleText("Audi");
		 * multipleselect.selectByVisibleText("Volvo"); }
		 * multipleselect.deselectByValue("audi"); multipleselect.deselectAll();
		 * 
		 * List<WebElement> optionsElements = multipleselect.getAllSelectedOptions();
		 * 
		 * for (WebElement webElement : optionsElements) {
		 * System.out.print(webElement.getText()); }
		 */
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		/*
		 * Select colour = new Select(driver.findElement(By.id("oldSelectMenu")));
		 * colour.selectByIndex(3); colour.selectByValue("6");
		 * colour.selectByVisibleText("Blue");
		 * 
		 * List<WebElement> options = colour.getOptions(); String textList =
		 * options.get(0).getText(); String selectedoption =
		 * colour.getFirstSelectedOption().getText(); System.out.println(textList);
		 * System.out.println(selectedoption);
		 * 
		 * 
		 * Select cars = new Select(driver.findElement(By.id("cars")));
		 * if(cars.isMultiple()){ cars.selectByIndex(3); cars.selectByIndex(1); }
		 * cars.deselectAll();
		 */
	

