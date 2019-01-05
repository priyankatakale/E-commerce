package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	public WebDriver driver;

	By email_loc = By.id("email_create");
	By emailreg_loc = By.id("email");
	By passwordreg_loc = By.id("passwd");
	By creatacc_loc = By.id("SubmitCreate");
	By forgotpaswd_loc = By.cssSelector("p[class='lost_password form-group']");
	By regSignin_loc = By.id("SubmitLogin");

	public SigninPage(WebDriver driver) {
		this.driver = driver;

	}

	public void getEmailCreateacc(String emailid) {
		driver.findElement(email_loc).sendKeys(emailid);

	}

	public void getregisterMailid(String regmailid) {
		driver.findElement(emailreg_loc).sendKeys(regmailid);
	}

	public void getregisterPassword(String regpassword) {
		driver.findElement(passwordreg_loc).sendKeys(regpassword);
	}

	public void getCreateacc() {
		driver.findElement(creatacc_loc).click();
	}

	public void getForgotpswd() {
		driver.findElement(forgotpaswd_loc).click();
	}

	public void getRegSignin() {
		driver.findElement(regSignin_loc).click();
	}
}