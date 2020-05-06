package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null;

//define locators of the page
	By textbox_search_googlepg= By.name("q");
	By button_search_googlepg=By.xpath("(//input[@name='btnK'])[2]");
	
	//constructor webdriver instance
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;		
	}
	
	//define methods for actions here
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search_googlepg).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search_googlepg).click();
	}
}
