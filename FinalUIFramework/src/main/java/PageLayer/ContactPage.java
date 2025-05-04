package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass{
	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(name = "value")
	private WebElement email;

	@FindBy(name = "status")
	private WebElement status;

	@FindBys(@FindBy(xpath = "//div[@name='status']/child::span"))
	private List<WebElement> statusLists;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void createContact(String FirstName, String LastName) {
		WebElementHelper.click(createButton);
		WebElementHelper.sendKeys(firstname, FirstName);
		WebElementHelper.sendKeys(lastname, LastName);
		WebElementHelper.click(saveButton);
	}

	public void createContact(String FirstName, String LastName, String Email) {
		WebElementHelper.click(createButton);
		WebElementHelper.sendKeys(firstname, FirstName);
		WebElementHelper.sendKeys(lastname, LastName);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(saveButton);
	}

	public void createContact(String FirstName, String LastName, String Email, String Status) {
		WebElementHelper.click(createButton);
		WebElementHelper.sendKeys(firstname, FirstName);
		WebElementHelper.sendKeys(lastname, LastName);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(status);
		DropDownHelper.selectValue(statusLists, Status);

		WebElementHelper.click(saveButton);
	}

	public void createContact(String FirstName, String LastName, String Email, String Status, String Desc) {
		WebElementHelper.click(createButton);
		WebElementHelper.sendKeys(firstname, FirstName);
		WebElementHelper.sendKeys(lastname, LastName);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(status);
		DropDownHelper.selectValue(statusLists, Status);
		WebElementHelper.sendKeys(description, Desc);
		WebElementHelper.click(saveButton);
	}


}
