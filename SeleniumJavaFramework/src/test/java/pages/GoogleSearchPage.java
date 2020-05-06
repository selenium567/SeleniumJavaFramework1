package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage 
{
	//define all object locators in a class page wise
	private static WebElement element=null;
	
	public static WebElement textbox_search(WebDriver driver)
	{
		 element=driver.findElement(By.name("q"));
		return element;		
	}
	
	public static WebElement button_search(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		return element;
		
	}

}
