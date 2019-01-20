package StepDefinations;

import PageObjects.SigninPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignIn extends Step {
	SigninPage s = new SigninPage(driver);

	@When("^User clicks on Signin tab$")
	public void user_clicks_on_signin_tab() throws Throwable {
		s.signinClick();
	}

	@Then("^User should be able to navigate to signin page$")
	public void user_should_be_able_to_navigate_to_signin_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@And("^User clicks on Signin$")
	public void user_clicks_on_signin() throws Throwable {
		s.signinClick();

	}

	@When("^user enters valid mail id \"([^\"]*)\"$")
	public void user_enters_valid_mail_id(String id) throws Throwable {
		s.enterEmailId(id);
		s.getCreateacc();
	}

	@Then("^User shold be able to navigate to signin site$")
	public void user_shold_be_able_to_navigate_to_signin_site() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("^user enters invalid mail id \"([^\"]*)\"$")
	public void user_enters_invalid_mail_id(String id) throws Throwable {
		s.enterEmailId(id);
		s.getCreateacc();
	}

	@Then("^It should give an error message as invalid email address$")
	public void it_should_give_an_error_message_as_invalid_email_address() throws Throwable {
		Assert.assertEquals(s.verifyErrorMessage(), "Invalid email address.");
	}

	@When("^user enters \"([^\"]*)\" and clicks on creat account tab$")
	public void user_enters_something_and_clicks_on_creat_account_tab(String id) throws Throwable {
		s.enterEmailId(id);
		s.getCreateacc();
	}

	@Then("^user shold be able to navigate to site for valid mail id$")
	public void user_shold_be_able_to_navigate_to_site_for_valid_mail_id() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@And("^User clicks on ContactUs tab$")
	public void user_clicks_on_contactus_tab() throws Throwable {
		s.clickContactUS();
	}

	@When("^user clicks on choose file and clicks on send$")
	public void user_clicks_on_choose_file_and_clicks_on_send() throws Throwable {
		Thread.sleep(3000);
		s.subjectHeading();
		s.mailAddress();
		Thread.sleep(3000);
		s.chooseFile();
		Thread.sleep(3000);
		s.textMessage();
		Thread.sleep(3000);
	}

	@Then("^user should be able to send uploaded file$")
	public void user_should_be_able_to_send_uploaded_file() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=contact");
	}
}