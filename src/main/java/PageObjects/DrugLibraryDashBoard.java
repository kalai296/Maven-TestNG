package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DrugLibraryDashBoard {
	public WebDriver driver;

	public DrugLibraryDashBoard(WebDriver driver) {
		this.driver = driver;
	}

	By drugLibraryDashboardSelection = By
			.xpath("//h2[@data-vandv='Drug Library Dashboard']");

	public WebElement getDrugLibraryDashboardSelection() {
		return driver.findElement(drugLibraryDashboardSelection);
	}

}
