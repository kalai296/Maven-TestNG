package PageObjects;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPgae {
	
	public WebDriver driver;
	
	public LoginPgae(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	By customerName = By.cssSelector("[data-vandv='customerNameField']");
//	By userName = By.cssSelector("[data-vandv='usernameField']");
//	By password = By.cssSelector("[data-vandv='passwordField']");
//	By loginButton = By.cssSelector("[data-vandv='loginBtn']");
	
	By customerName = By.cssSelector("[data-vandv='customerNameField']");
	By userName = By.cssSelector("[data-vandv='usernameField']");
	By password = By.cssSelector("[data-vandv='passwordField']");
	By loginButton = By.cssSelector("[data-vandv='loginBtn']");
	
	public WebElement getCustomerName(){
		return driver.findElement(customerName);
	}
	
	public WebElement getUserName(){
		return driver.findElement(userName);
	}
	
	public WebElement getPassword(){
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton(){
		return driver.findElement(loginButton);
	}
	
	
//	public WebElement getElement(HashMap<String, String> hash){
//		Set<String> keys = hash.keySet();
//		ArrayList<String> list = new ArrayList<String>(keys);
//		return driver.findElement(By.(list.get(0))(hash.get(list.get(0)));
//	}

}
