package StepDefinations;

import org.junit.runner.RunWith;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.Slider;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class HomePageSteps extends Step {
	HomePage hp = new HomePage(driver);
	int noOfItemsInCart;

	@When("^user clicks on \"([^\"]*)\" compositions checkbox$")
	public void user_clicks_on_something_compositions_checkbox(String abc) throws Throwable {
		switch (abc) {
		case "cotton":
			hp.cottonCheckbox();
			break;
		case "polyester":
			hp.polyesterCheckbox();
			break;
		case "viscose":
			hp.viscoseCheckbox();
			break;
		}
	}

    @Then("^user should be able to click on cotton checkbox$")
	public void user_should_be_able_to_click_on_cotton_checkbox() throws Throwable {
		boolean actual = hp.verifyCottonCheckbox();
		Assert.assertTrue(actual);
	}

	@Then("^user should be able to click on polyester checkbox$")
	public void user_should_be_able_to_click_on_polyester_checkbox() throws Throwable {
		boolean actual = hp.verifyPolyesterCheckbox();
		Assert.assertTrue(actual);
	}

	@Then("^user should be able to click on viscose compositions checkbox$")
	public void user_should_be_able_to_click_on_viscose_compositions_checkbox() throws Throwable {
		boolean actual = hp.verifyViscoseCheckbox();
		Assert.assertTrue(actual);
	}

	@When("^^User clicks on \"([^\"]*)\" link on follow us$")
	public void user_clicks_on_something_link_on_follow_us(String strArg1) throws Throwable {
		switch (strArg1) {
		case "Facebook":
			hp.verifyFacebookLink();
			break;
		case "Twitter":
			hp.verifyTwitterLink();
			break;
		}
	}

	@Then("^User should be able to navigate to facebook in new window$")
	public void user_should_be_able_to_navigate_to_facebook_in_new_window() throws Throwable {
		String actual = hp.verifyFacebookUrl();
		Assert.assertEquals(actual, "https://www.facebook.com/groups/525066904174158/");
	}

	@When("^user sets the slider xcordinate to (\\d+)$")
	public void user_sets_the_slider_xcordinate(int x) throws Throwable {
		Slider s = new Slider(driver);
		s.setSilderLocation(x);
	}

	@Then("^expected price range should be \"([^\"]*)\"$")
	public void expected_price_range_should_be_displayed(String value) throws Throwable {
		Slider s = new Slider(driver);
		Assert.assertEquals(s.getPriceRange(), value);
	}

	@When("^User clicks on advertise link (\\d+)$")
	public void user_clicks_on_advertise_link_1(int index) throws Throwable {
		hp.verifyAdLinks(index);

	}

	@Then("^User should be able to navigate to advertise page$")
	public void user_should_be_able_to_navigate_to_advertise_page() throws Throwable {
		Assert.assertEquals(hp.verifyURL(), "https://www.prestashop.com/en");
	}

	@When("^User clicks on image (\\d+) and adds (\\d+) items$")
	public void user_clicks_on_image_and_adds_items(int index, int noofitems) throws Throwable {
		driver = hp.imageClick(index);
		noOfItemsInCart = noofitems;
		for (int i = 0; i < noofitems; i++) {
			hp.plusIconClick();
		}
	}

	@Then("^User should be able to see added items$")
	public void user_should_be_add_the_quantity() throws Throwable {
		String actual = hp.quantityTextbox();
		Assert.assertEquals(actual, noOfItemsInCart);
	}

	@When("^User clicks on image (\\d+) and select (\\d+) size form dropdown$")
	public void user_clicks_on_image_1_and_select_size_form_dropdown(int index, int size) throws Throwable {
		hp.imageClick(index);
		 Assert.assertEquals(hp.sizeDropdown(size), "M");
	}
}