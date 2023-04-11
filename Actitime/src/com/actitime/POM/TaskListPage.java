package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {	
	//createCustomer
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@autocomplete='off' and @placeholder='Enter Customer Name']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement actualCustomerCreated;
	
	
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
	//**********************************************************************************************
	//create new project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement PleaseSelectCustomerDD;
	
	@FindBy(xpath="//div[text()='RBI_001']")
	private WebElement createdCustomer;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescription;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement actualCreatedProject;
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getPleaseSelectCustomerDD() {
		return PleaseSelectCustomerDD;
	}

	public WebElement getCreatedCustomer() {
		return createdCustomer;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualCreatedProject() {
		return actualCreatedProject;
	}
	
	public WebElement getenterProjectDescription() {
		return enterProjectDescription;
	}
//*************************************************************************************************
	//*********************************************************************************************
/*	//creating new task
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;
	
	@FindBy(xpath="(//div[@class='comboboxButton'])[1]")
	private WebElement customerNameDD;
	
	@FindBy(xpath="(//div[@class='comboboxButton'])[2]")
	private WebElement projectNameDD;
	
	@FindBy(xpath="//div[text()='- New Project -']")
	private
	*/
	
}
