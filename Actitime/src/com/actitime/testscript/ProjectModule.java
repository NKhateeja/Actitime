package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{

	@Test
	public void testCreateProject() throws InterruptedException, IOException
	{
		Reporter.log("createProject",true);
		HomePage h=new HomePage(driver);
		h.selectTaskTab();
		FileLib f=new FileLib();
		String projName = f.getExcelData("createProject", 1, 3);
		String projDesc = f.getExcelData("createProject", 1, 4);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(projName);
		t.getPleaseSelectCustomerDD().click();
		t.getCreatedCustomer().click();
		t.getenterProjectDescription().sendKeys(projDesc);
		t.getCreateProjectBtn().click();
		Thread.sleep(4000);
		String actualProjName = t.getActualCreatedProject().getText();
		Assert.assertEquals(actualProjName, projName);
	}
}
