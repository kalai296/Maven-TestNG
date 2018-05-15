package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By navajoHomeDropdown = By.xpath("//h2[@data-vandv='Navajo Home']");
	By drugLibraryDashboardOption = By
			.xpath("//a[@data-vandv='drugLibraryDashboardOpt']");

	public WebElement getnavajoHomeDropdown() {
		return driver.findElement(navajoHomeDropdown);
	}

	public WebElement getdrugLibraryDashboardOption() {
		return driver.findElement(drugLibraryDashboardOption);
	}

}

