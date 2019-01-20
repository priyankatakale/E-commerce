package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import PageObjects.HomePage;
import PageObjects.WomenTabPage;

public class WomenTabSteps extends Step {
	WomenTabPage wp;
	HomePage hp;

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
		wp = new WomenTabPage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(wp.verifyTopslink(), true);
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String urlkey) throws Throwable {
		driver.get(prop.getProperty(urlkey));
	}

	@When("^user clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_submenu(String submenuName) throws Throwable {
		wp = new WomenTabPage(driver);
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
		wp = new WomenTabPage(driver);
		wp.getSortby();

	}

	@Then("^user should be able to select values from dropdown$")
	public void user_should_be_able_to_select_values_from_dropdown() throws Throwable {
		wp = new WomenTabPage(driver);
		String actual = wp.getSortby();
		String expected = "Highest first";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on \"([^\"]*)\" checkbox$")
	public void user_clicks_on_something_checkbox(String size) throws Throwable {
		wp = new WomenTabPage(driver);
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
		wp = new WomenTabPage(driver);
		boolean actual = wp.verifySizes();
		Assert.assertEquals(actual, true);
	}

	@And("^i select item at (\\d+) clicks on Add to cart tab$")
	@When("^user select an item at position (\\d+) clicks on Add to cart tab$")
	public void user_select_an_item_at_position_0_clicks_on_add_to_cart_tab(int index) throws Throwable {
		wp = new WomenTabPage(driver);
		wp.addToCartClick(index);
	}

	@Then("^user should be able to sucessfully add the item to cart$")
	public void user_should_be_able_to_sucessfully_add_the_item_to_cart() throws Throwable {
		wp = new WomenTabPage(driver);
		boolean actual = wp.verifyCart();
		System.out.println(actual);
		Assert.assertEquals(actual, true);

	}

	@When("^user select clicks on More tab at position (\\d+)$")
	public void user_select_clicks_on_more_tab_at_position_0(int index) throws Throwable {
		wp = new WomenTabPage(driver);
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

	@When("^i search for \"([^\"]*)\" in serach text box$")
	public void i_search_for_something_in_serach_text_box(String strArg1) throws Throwable {
		wp = new WomenTabPage(driver);
		wp.search(strArg1);
	}

	@Then("^search results should find \"([^\"]*)\" items$")
	public void i_should_find_count_of_items(String items) throws Throwable {
		String expected = String.format("Showing %s - %s of %s item", items, items, items);
		Assert.assertEquals(wp.searchResultText, expected);
	}

	@And("^user select an item at position (\\d+) and (\\d+)$")
	public void user_select_an_item_at_position_0(int i, int index) throws Throwable {
		wp = new WomenTabPage(driver);
		wp.clickOnImage(i, index);
	}

	@And("send to a friend tab$")
	@When("^user clicks on send to a friend tab$")
	public void user_clicks_on_send_to_a_friend_tab() throws Throwable {
		wp = new WomenTabPage(driver);
		wp.sendFrndTab();
	}

	@And("^open new window$")
	@Then("^it should open new window$")
	public void it_should_open_new_window() throws Throwable {
		wp = new WomenTabPage(driver);
		Assert.assertEquals(wp.verifyNewPopup(), "SEND TO A FRIEND");
	}

	@When("^i enter \"([^\"]*)\" and \"([^\"]*)\" and clicks on send button$")
	public void i_enter_name_mailid_and_clicks_on_send_button(String name, String mailid) throws Throwable {
		wp = new WomenTabPage(driver);
		wp.frndNameTextbox(name);
		wp.frndMailTextbox(mailid);
		wp.sendButtonClick();
	}

	@Then("^i should be able to send an email to friend$")
	public void i_should_be_able_to_send_an_email_to_friend() throws Throwable {
		wp = new WomenTabPage(driver);
		Assert.assertEquals(wp.verifyMsg(), "Your e-mail has been sent successfully");
	}

	@When("^user clicks on Add to wishlist tab$")
	public void user_clicks_on_add_to_wishlist_tab() throws Throwable {
		wp = new WomenTabPage(driver);
		wp.clickToAddToWishlist();
	}

	@Then("^user should see message as you must be logged in$")
	public void user_should_see_message_as_you_must_be_logged_in() throws Throwable {
		wp = new WomenTabPage(driver);
		Assert.assertEquals(wp.verifyAddToWishlist(), "You must be logged in to manage your wishlist.");
	}

	/*
	 * @AfterTest @Override public void cleanup() { driver.close(); }
	 */

	@After()
	public void cleanup() {
		driver.close();

	}
}