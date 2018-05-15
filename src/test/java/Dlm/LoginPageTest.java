package Dlm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.DrugLibraryDashBoard;
import PageObjects.HomePage;
import PageObjects.LoginPgae;

public class LoginPageTest extends Base {
	public WebDriver driver;
	LoginPgae loginPageObj;
	HomePage homePageObj;
	DrugLibraryDashBoard drugLibraryDashBoardobj;

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intializeDrive() {
		try {
			driver = initializeDrive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug(e);
		}
		// driver.get(prop.getProperty("url"));
		// log.info("validateLogin - Successfully navigated to Mednet application");
	}

	@Test
	// (dataProvider = "getData")
	public void validateLogin() {
		driver.get(prop.getProperty("url"));
		log.info("validateLogin - Successfully navigated to Mednet application");
		loginPageObj = new LoginPgae(driver);
		loginPageObj.getCustomerName().sendKeys(
				prop.getProperty("customerUserName"));// (customerUserName);
		// prop.getProperty("customerUserName"));
		loginPageObj.getUserName().sendKeys(prop.getProperty("userName"));// (userName);//
																			// prop.getProperty("userName"));
		loginPageObj.getPassword().sendKeys(prop.getProperty("password"));// (passWord);//
																			// prop.getProperty("password"));
		loginPageObj.getLoginButton().click();
		log.info("validateLogin - Successfully logged into application");

		homePageObj = new HomePage(driver);
		Assert.assertEquals(homePageObj.getnavajoHomeDropdown().isDisplayed(),
				true);
		homePageObj.getnavajoHomeDropdown().click();
		homePageObj.getdrugLibraryDashboardOption().click();
		log.info("validateLogin - Successfully navigated to drugLibrarydashboard");

		drugLibraryDashBoardobj = new DrugLibraryDashBoard(driver);
		// WebDriverWait wait = new WebDriverWait(driver, 110);

		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(drugLibraryDashBoardobj
		// .getDrugLibraryDashboardSelection()));
		// Assert.assertEquals(element.isDisplayed(), false);
		Assert.assertEquals(drugLibraryDashBoardobj
				.getDrugLibraryDashboardSelection().isDisplayed(), false);

	}

	@DataProvider
	public Object[][] getData() {
		// Row -> how many different set of data, a test should run
		// Column -> how many values per each test case or set
		Object[][] data = new Object[2][3];

		data[0][0] = "carlsbad";
		data[0][1] = "stevefarwell";
		data[0][2] = "Incorrect1!";

		data[1][0] = "system";
		data[1][1] = "sysadmin";
		data[1][2] = "Incorrect2!";
		return data;

	}

	@AfterTest
	public void closeInstance() {
		driver.close();
		driver = null;
		log.info("validateLogin - Successfully closed mednet instance");
	}

	
	//*[@id="leftcontainer"]/table/thead/tr/th[1]
	//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/
	
	
}
