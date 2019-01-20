package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Page {
	public WebDriver driver;

	By yourlogo_loc = By.cssSelector("img.logo.img-responsive");
	By firstImg_loc = By.cssSelector("img.img-responsive");
	By contactUs_loc = By.tagName("Contact Us");
	By signin_loc = By.cssSelector("a[class='login']");
	By search_loc = By.id("search_query_top");
	By cart_loc = By.cssSelector("div[class='shopping_cart']");
	By callus_loc = By.cssSelector("span.shop-phone");
	By women_loc = By.cssSelector("a.sf-with-ul");
	By dresses_loc = By.tagName("Dresses");
	By Tshirts_loc = By.tagName("T-shirts");
	By popular_loc = By.tagName("Popular");
	By bestsellers_loc = By.tagName("Best Sellers");
	By newsletter_loc = By.tagName("newsletter_block_left");
	By cotton_loc = By.id("layered_id_feature_5");
	By poleyster_loc = By.id("layered_id_feature_1");
	By viscose_loc = By.id("layered_id_feature_3");
	By facebook_loc = By.cssSelector("li[class='facebook']");
	By twitter_loc = By.cssSelector("li[class='twitter']");
	By adlinks_loc = By.cssSelector("div[id='htmlcontent_home'] ul li a[class='item-link']");
	By hoverimage_loc = By.cssSelector("img[class='replace-2x img-responsive']");
	By imageicon_loc = By.cssSelector("a[class='quick-view']");
	By plusicon_loc = By.cssSelector("a[data-field-qty='qty'] i[class='icon-plus']");
	By quantityTexbox_loc = By.id("quantity_wanted");
	By sizedropdown_loc = By.cssSelector("div[class='selector'] select[name='group_1']");

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void getYourlogo() {
		driver.findElement(yourlogo_loc).click();
	}

	public void getfirstImg() {
		driver.findElement(firstImg_loc).click();
	}

	public void getcontactUs() {
		driver.findElement(contactUs_loc).click();
	}

	public void getSignin() {
		driver.findElement(signin_loc).click();
	}

	public void getSearch() {
		driver.findElement(search_loc).click();
	}

	public void getCart() {
		driver.findElement(cart_loc).click();
	}

	public void getCallUs() {
		System.out.println(driver.findElement(cart_loc).isDisplayed());
	}

	public void getWomenlink() {
		WebElement element = driver.findElement(women_loc);
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public void getDresseslink() {
		driver.findElement(dresses_loc).click();
	}

	public void getTshirtslink() {
		driver.findElement(Tshirts_loc).click();
	}

	public void getPopularlink() {
		driver.findElement(popular_loc).click();
	}

	public void getBestSellerlink() {
		driver.findElement(bestsellers_loc).click();
	}

	public void getNewsletterlink() {
		driver.findElement(newsletter_loc).click();
	}

	public void getWomen() {
		driver.findElement(women_loc).click();
	}

	public void cottonCheckbox() {
		driver.findElement(cotton_loc).click();
	}

	public void polyesterCheckbox() {
		driver.findElement(poleyster_loc).click();
	}

	public void viscoseCheckbox() {
		driver.findElement(viscose_loc).click();
	}

	public boolean verifyCottonCheckbox() {
		return driver.findElement(cotton_loc).isSelected();
	}

	public boolean verifyPolyesterCheckbox() {
		return driver.findElement(poleyster_loc).isSelected();
	}

	public boolean verifyViscoseCheckbox() {
		return driver.findElement(viscose_loc).isSelected();
	}

	public void verifyFacebookLink() {
		driver.findElement(facebook_loc).click();
	}

	public String verifyFacebookUrl() {
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		it.next();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		return driver.getCurrentUrl();
	}

	public void verifyTwitterLink() {
		driver.findElement(twitter_loc).click();
	}

	public void verifyAdLinks(int index) {
		driver.findElements(adlinks_loc).get(index).click();
	}

	public String verifyURL() {
		return driver.getCurrentUrl();
	}

	public WebDriver imageClick(int index) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElements(hoverimage_loc).get(index)).build().perform();
		driver.findElements(imageicon_loc).get(index).click();
		return driver.switchTo().frame(driver.findElement(By.cssSelector("div[class='fancybox-outer'] iframe")));
	}

	public void plusIconClick() {
		driver.findElement(plusicon_loc).click();
	}

	public String quantityTextbox() {
		return driver.findElement(quantityTexbox_loc).getAttribute("value");
	}

	public WebElement sizeDropdown(int size) {
		Select s = new Select(driver.findElement(sizedropdown_loc));
		s.selectByIndex(size);
		return s.getFirstSelectedOption();
	}

	public WebElement sizeDropdown(String getsize) {
		Select s = new Select(driver.findElement(sizedropdown_loc));
		s.selectByVisibleText(getsize);
		return s.getFirstSelectedOption();
	}

}