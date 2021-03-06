package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step {
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fs;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("./src/main/java/resources/dataProperties");
		prop.load(fs);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"../../../../Selenium//webdriver//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	@After
	public void cleanup() {
		driver.close();
	}
}