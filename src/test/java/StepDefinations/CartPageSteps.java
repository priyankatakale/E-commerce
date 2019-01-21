package StepDefinations;

import org.testng.Assert;

import PageObjects.CartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartPageSteps extends Step {
	CartPage cp;

	@When("^i click on cart tab$")
	public void i_click_on_cart_tab() throws Throwable {
		cp = new CartPage(driver);
		cp.clickOnCart();
	}

	@Then("^i navigate to checkout page$")
	public void i_navigate_to_checkout_page() throws Throwable {
		cp = new CartPage(driver);
		Assert.assertEquals(cp.verifyCurrentUrl(), "http://automationpractice.com/index.php?controller=order");

	}

	@When("^i click on image icon$")
	public void i_click_on_image_icon(int index) throws Throwable {
		cp = new CartPage(driver);
		cp.ClickImageIcon(index);
	}

	@Then("^i should be able to navigate to url$")
	public void i_should_be_able_to_navigate_to_url() throws Throwable {
		driver.getCurrentUrl();
		
	}
}
