package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void screenshot(WebDriver driver, long ms)
	{

	try {
//	    TakesScreenshot ts = (TakesScreenshot) driver;
//	    File source = ts.getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(source, new File("./ScreenShots/"+ms+"Facebook.png"));
//	    System.out.println("ScreenShot Taken");
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}
}