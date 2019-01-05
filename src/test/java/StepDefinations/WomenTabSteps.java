package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.Assert;

import PageObjects.CommonBase;
import PageObjects.HomePage;
import PageObjects.WomenlinkPage;

@RunWith(Cucumber.class)

public class WomenTabSteps extends CommonBase {
	WomenlinkPage wp = new WomenlinkPage(driver);
	HomePage hp = new HomePage(driver);

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
		initializeDriver();
	}

	@When("^user hover on women tab$")
	public void user_hover_on_women_tab() throws Throwable {
		hp = new HomePage(driver);
		hp.getWomenlink();
	}

	@Then("^verify that women tab should display sub menus$")
	public void verify_that_women_tab_should_display_sub_menus() throws Throwable {
		wp = new WomenlinkPage(driver);
		Assert.assertEquals(wp.verifyTopslink(), true);

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String urlkey) throws Throwable {
		driver.get(prop.getProperty(urlkey));
	}

	@When("^user clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_submenu(String submenuName) throws Throwable {
		wp = new WomenlinkPage(driver);
		hp = new HomePage(driver);
		hp.getWomenlink();
		switch (submenuName) {
		case "Tops":
			wp.getTopslink();
			break;
		case "T-shirts":
			wp.getTshirts();
			break;
		case "Blouses":
			wp.getBlouses();
		}
	}

	@Then("^user should be able to navigate to site \"([^\"]*)\"$")
	public void user_should_be_able_to_navigate_to_site(String expected_url) throws Throwable {
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
	}

	@And("^click on Women tab$")
	public void click_on_women_tab() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp = new HomePage(driver);
		hp.getWomen();
	}

	@When("^user clicks on Sortby tab$")
	public void user_clicks_on_sortby_tab() throws Throwable {
		wp = new WomenlinkPage(driver);
		wp.getSortby();

	}

	@Then("^user should be able to select values from dropdown$")
	public void user_should_be_able_to_select_values_from_dropdown() throws Throwable {
		wp = new WomenlinkPage(driver);
		String actual = wp.getSortby();
		String expected = "Highest first";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on \"([^\"]*)\" checkbox$")
	public void user_clicks_on_something_checkbox(String size) throws Throwable {
		wp = new WomenlinkPage(driver);
		switch (size) {
		case "sizeS":
			wp.CheckboxSizeS();
			break;
		case "sizeM":
			wp.CheckboxSizeM();
			break;
		case "sizeL":
			wp.CheckboxSizeL();
			break;
		}
	}

	@Then("^User should be able to click on checkbox$")
	public void user_should_be_able_to_click_on_checkbox() throws Throwable {
		wp = new WomenlinkPage(driver);
		boolean actual = wp.verifySizes();
		Assert.assertEquals(actual, true);
	}

	@When("^user select an item at position (\\d+) clicks on Add to cart tab$")
	public void user_select_an_item_at_position_0_clicks_on_add_to_cart_tab(int index) throws Throwable {
		wp = new WomenlinkPage(driver);
		wp.addToCartClick(index);
	}

	@Then("^user should be able to sucessfully add the item to cart$")
	public void user_should_be_able_to_sucessfully_add_the_item_to_cart() throws Throwable {
		wp = new WomenlinkPage(driver);
		boolean actual = wp.verifyCart();
		System.out.println(actual);
		Assert.assertEquals(actual, true);

	}

	@When("^user select clicks on More tab at position (\\d+)$")
	public void user_select_clicks_on_more_tab_at_position_0(int index) throws Throwable {
		wp = new WomenlinkPage(driver);
		wp.moreClick(index);
	}

	@Then("^user should be able to navigate to next page$")
	public void user_should_be_able_to_navigate_to_next_page() throws Throwable {
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, "http://automationpractice.com/index.php?id_product=1&controller=product");
	}

	@When("^user clicks on checkout tab$")
	public void user_clicks_on_checkout_tab() throws Throwable {
		wp.checkoutClick();

	}

	@Then("^User should be able to navigate to site \"([^\"]*)\"$")
	public void user_should_be_able_to_navigate_to_site_something(String strArg1) throws Throwable {
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, "http://automationpractice.com/index.php?controller=order");
	}
}