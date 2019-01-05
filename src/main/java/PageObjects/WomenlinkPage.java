package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WomenlinkPage {

	public WebDriver driver;

	By tops_loc = By.cssSelector("ul[class='submenu-container clearfix first-in-line-xs'] li a[title='Tops']");
	By sortby_loc = By.id("selectProductSort");
	By tshirtsubmenu_loc = By
			.cssSelector("ul[class='submenu-container clearfix first-in-line-xs'] li ul li a[title='T-shirts']");
	By blouses_loc = By
			.cssSelector("ul[class='submenu-container clearfix first-in-line-xs'] li ul li a[title='Blouses']");
	By sizeS_loc = By.id("layered_id_attribute_group_1");
	By sizeM_loc = By.id("layered_id_attribute_group_2");
	By sizeL_loc = By.id("layered_id_attribute_group_3");
	By addTocart_loc = By.cssSelector("div a[title='Add to cart']");
	By verifycart_loc = By.cssSelector("i[class='icon-ok']");
	By checkout_loc = By.cssSelector("a[class='btn btn-default button button-medium']");
	By more_loc = By.cssSelector("a[class='button lnk_view btn btn-default']");

	public WomenlinkPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyTopslink() {
		return driver.findElement(tops_loc).isDisplayed();
	}

	public String getSortby() {
		Select s = new Select(driver.findElement(sortby_loc));
		s.selectByIndex(2);
		WebElement ele = s.getFirstSelectedOption();
		String act = ele.getText();
		return act;
	}

	public void getTshirts() {
		driver.findElement(tshirtsubmenu_loc).click();
	}

	public void getBlouses() {
		driver.findElement(blouses_loc).click();
	}

	public void CheckboxSizeS() {
		driver.findElement(sizeS_loc).click();
	}

	public void CheckboxSizeM() {
		driver.findElement(sizeM_loc).click();
	}

	public void CheckboxSizeL() {
		driver.findElement(sizeL_loc).click();
	}

	public void getTopslink() {
		driver.findElement(tops_loc).click();
	}

	public boolean verifySizes() {
		return driver.findElement(sizeS_loc).isSelected();
	}

	public void addToCartClick(int index) {
		driver.findElements(addTocart_loc).get(index).click();

	}

	public boolean verifyCart() {
		return driver.findElement(verifycart_loc).isDisplayed();
	}

	public void checkoutClick() {
		driver.findElement(checkout_loc).click();
	}

	public void moreClick(int index) {
		driver.findElements(more_loc).get(index).click();
	}
}