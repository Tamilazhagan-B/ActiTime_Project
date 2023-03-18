package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Create_Customer extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException
	{
		//creating object for HomePage for accessing the Elements
		HomePage hp=new HomePage(driver);
		hp.getTasks().click();
		TaskList ts=new TaskList(driver);
		ts.getAddnewbtn().click();
		ts.getNewcustomerbtn().click();
		ts.getEnterCurrentName().sendKeys("HDFC_001");
		ts.getEnterCurrentDes().sendKeys("Banking project");
		ts.getSelectCustomerScrollBar().click();
		ts.getSelectCustomer().click();
		ts.getCreateCustomer().click();
		Thread.sleep(4000);
		String actual = ts.getVerifyUser().getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, "HDFC_001");
		sa.assertAll();
	}
}
