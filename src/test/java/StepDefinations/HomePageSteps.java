package StepDefinations;

import org.junit.runner.RunWith;
import org.testng.Assert;

import PageObjects.CommonBase;
import PageObjects.HomePage;
import PageObjects.Slider;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class HomePageSteps extends CommonBase {
	HomePage hp = new HomePage(driver);

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

	@Then("^user should be able to click on select checkbox$")
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
}