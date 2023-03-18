package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskList extends BaseClass{
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	private WebElement newcustomerbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCurrentName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCurrentDes;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement selectCustomerScrollBar;
		
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="(//div[@class='components_button_label'])[17]")
	private WebElement createCustomer;
	
	@FindBy(xpath="(//div[@class='title'])[29]")
	private WebElement verifyUser;
	
	
	/*
	 * @FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") private
	 * WebElement seaele;
	 * 
	 * @FindBy(xpath="(//div[@class='editButton'])[15]") private WebElement presseb;
	 * 
	 * @FindBy(xpath="(//div[@class='action'])[4]") private WebElement abutn;
	 * 
	 * @FindBy(xpath="(//div[text()='Delete'])[2]") private WebElement clidel;
	 * 
	 * @FindBy(xpath="(//span[text()='Delete permanently'])") private WebElement
	 * delper;
	 */

	public TaskList(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddnewbtn() {
		return addnewbtn;
	}


	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}


	public WebElement getEnterCurrentName() {
		return enterCurrentName;
	}


	public WebElement getEnterCurrentDes() {
		return enterCurrentDes;
	}


	public WebElement getSelectCustomerScrollBar() {
		return selectCustomerScrollBar;
	}


	public WebElement getSelectCustomer() {
		return selectCustomer;
	}


	public WebElement getCreateCustomer() {
		return createCustomer;
	}


	public WebElement getVerifyUser() {
		return verifyUser;
	}
	
	
	
	
	
	
}
