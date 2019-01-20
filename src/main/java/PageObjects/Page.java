package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
	public WebDriver driver;
	By search_loc = By.cssSelector("input[class='search_query form-control ac_input']");
	By search_button_loc = By.cssSelector("button[name='submit_search']");

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public void search(String searchitem) {
		WebElement searchTextBox = driver.findElement(search_loc);
		searchTextBox.sendKeys(searchitem);
		driver.findElement(search_button_loc).click();
	}
}