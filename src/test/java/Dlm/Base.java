package Dlm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;



public class Base {
	public WebDriver driver;
	public static NgWebDriver ngDriver;
	Properties prop = new Properties();

	public WebDriver initializeDrive() throws IOException {

		FileInputStream fin = new FileInputStream(
				"C://Users//20446583//DLMProject//src//main//java//resources//Data.properties");
		prop.load(fin);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty(
					"webdriver.chrome.driver",
					"C://nodejs//node_modules//protractor//node_modules//webdriver-manager//selenium//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C://Users//20446583//Downloads//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {

		}

		ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		ngDriver.waitForAngularRequestsToFinish();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C://Users//20446583//Desktop//maven_test_screenshots//" + " "
						+ result + " " + "screenshot.png"));
	}
}
