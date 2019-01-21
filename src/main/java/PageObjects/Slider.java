package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public WebDriver driver;
	By slider_loc = By.cssSelector("div[class='ui-slider-range ui-widget-header ui-corner-all']");
	By price_loc = By.id("layered_price_range");

	public Slider(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifySlider() {
		return driver.findElements(slider_loc).get(0);
	}

	public void setSilderLocation(int x) throws InterruptedException {
		WebElement slider = verifySlider();
		Actions builder = new Actions(driver);
		builder.moveToElement(slider).click().dragAndDropBy(slider, x, 0).build().perform();
	}

	public String getPriceRange() {
		String priceRange = driver.findElement(price_loc).getText();
		return priceRange;
	}
}
