package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	public WebDriver driver;

	@FindBy(css = "div[class='shopping_cart'] a")
	WebElement cart_loc;
	By deleteicon_loc = By.cssSelector("a[class='cart_quantity_delete']");
	By image_loc = By.cssSelector("td[class='cart_product']");
	By checkout_loc = By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnCart() {
		(cart_loc).click();
	}

	public void ClickDeleteIcon(int index) {
		driver.findElements(deleteicon_loc).get(index).click();
	}

	public void ClickImageIcon(int index) {
		driver.findElements(deleteicon_loc).get(index).click();
	}

	public void ClickProceedToCheckout() {
		driver.findElement(checkout_loc).click();
	}

	public String verifyCurrentUrl() {
		return driver.getCurrentUrl();
	}
}