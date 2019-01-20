package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SigninPage {
	public WebDriver driver;

	By email_loc = By.id("email_create");
	By emailreg_loc = By.id("email");
	By passwordreg_loc = By.id("passwd");
	By creatacc_loc = By.id("SubmitCreate");
	By forgotpaswd_loc = By.cssSelector("p[class='lost_password form-group']");
	By regSignin_loc = By.id("SubmitLogin");
	By signin_loc = By.cssSelector("a[class='login']");
	By emailid_loc = By.cssSelector("input[class='is_required validate account_input form-control']");
	By invalidid_loc = By.cssSelector("div[class='alert alert-danger'] li");
	By contactus_loc = By.cssSelector("div[id='contact-link']");
	By chooseFile_loc = By.cssSelector("#uniform-fileUpload span[class='filename']");
	By send_loc = By.cssSelector("div[class='submit'] span");
	By subjetheading_loc = By.cssSelector("div[class='selector'] select[id='id_contact']");
	By mailaddress_loc = By.cssSelector("input[class='form-control grey validate']");
	By messageText_loc = By.cssSelector("div[class='form-group'] textarea[id='message']");

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

	public void signinClick() {
		driver.findElement(signin_loc).click();
	}

	public void enterEmailId(String id) {
		driver.findElement(emailid_loc).sendKeys(id);
	}

	public String verifyErrorMessage() {
		return driver.findElement(invalidid_loc).getText();
	}

	public void clickContactUS() {
		driver.findElement(contactus_loc).click();
	}

	public void chooseFile() {
		WebElement uploadfile = driver.findElement(chooseFile_loc);
		uploadfile.sendKeys("C:\\Users\\Priyanka\\Downloads\\Priyanka-Resume-latest.docx");
		//driver.findElement(send_loc).click();
	}

	public WebElement subjectHeading() {
		Select s = new Select(driver.findElement(subjetheading_loc));
		s.selectByIndex(1);
		return s.getFirstSelectedOption();
	}

	public void mailAddress() {
		driver.findElement(mailaddress_loc).sendKeys("rasal@gmail.com");
	}

	public void textMessage() {
		driver.findElement(messageText_loc).sendKeys("hi");
	}
}