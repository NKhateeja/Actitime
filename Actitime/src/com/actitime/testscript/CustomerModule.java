package com.actitime.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException, IOException
	{
		Reporter.log("createcustomer",true);
		HomePage h=new HomePage(driver);
		h.selectTaskTab();
		FileLib f=new FileLib();
		String custName = f.getExcelData("createCustomer", 1, 3);
		String custDesc = f.getExcelData("createCustomer", 1, 4);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomer().click();
		t.getEnterCustomerName().sendKeys(custName);
		t.getEnterCustomerDescription().sendKeys(custDesc);
		t.getSelectCustomerDD().click();
		t.getOurCompany().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(4000);
		String actualCus = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualCus, custName);
		
	}
}
