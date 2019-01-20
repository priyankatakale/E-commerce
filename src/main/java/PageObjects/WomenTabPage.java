package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WomenTabPage extends Page {

	public WebDriver driver;
	public String searchResultText;
	public String moreTab;

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
	By more_loc = By.cssSelector("div[class='product-container'] a[class='button lnk_view btn btn-default']");
	By serachResult_loc = By.cssSelector("div[class='product-count']");
	By frndname_loc = By.cssSelector("div[id='send_friend_form'] input[id='friend_name']");
	By mailid_loc = By.cssSelector("div[id='send_friend_form'] input[id='friend_email']");
	By sendbutton_loc = By.cssSelector("div[id='send_friend_form'] button[id='sendEmail']");
	By sendfrnd_loc = By.id("send_friend_button");
	By newwindow_loc = By
			.cssSelector("div[class='fancybox-wrap fancybox-desktop fancybox-type-inline fancybox-opened'] h2");
	By imageicon_loc = By.cssSelector("a[class='quick-view']");
	By hoverimage_loc = By.cssSelector("img[class='replace-2x img-responsive']");
	By msg_loc = By.cssSelector("div[class='fancybox-wrap fancybox-desktop fancybox-type-html fancybox-opened'] p");
	By wishlist_loc = By.id("wishlist_button");
	By wishlistText_loc = By.cssSelector("div[class='fancybox-inner'] p");

	public WomenTabPage(WebDriver driverIn) {
		super(driverIn);
		this.driver = driverIn;
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

	public void moreClick(int index) throws InterruptedException {
		driver.findElements(more_loc).get(index).click();
	}

	@Override
	public void search(String searchitem) {
		super.search(searchitem);
		searchResultText = driver.findElements(serachResult_loc).get(0).getText();
	}

	public void sendFrndTab() {
		driver.findElement(sendfrnd_loc).click();
	}

	public void frndNameTextbox(String name) {
		driver.findElement(frndname_loc).sendKeys(name);
	}

	public void frndMailTextbox(String mailid) {
		driver.findElement(mailid_loc).sendKeys(mailid);
	}

	public void sendButtonClick() {
		driver.findElement(sendbutton_loc).click();
	}

	public String verifyNewPopup() {
		return driver.findElement(newwindow_loc).getText();
	}

	public String clickOnImage(int i, int index) throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElements(hoverimage_loc).get(i)).build().perform();
		moreClick(index);
		return driver.getCurrentUrl();
	}

	public String verifyMsg() {
		return driver.findElements(msg_loc).get(0).getText();
	}

	public void clickToAddToWishlist() {
		driver.findElement(wishlist_loc).click();
	}

	public String verifyAddToWishlist() {
		return driver.findElement(wishlistText_loc).getText();
	}

}