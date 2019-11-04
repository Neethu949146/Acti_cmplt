package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login 
{
	@FindBy(id="username")
	private WebElement ustbox;
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logbtn;
	public Acti_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void us()
	{
		ustbox.sendKeys("admin");
	}
	public void pd()
	{
		pwdtbox.sendKeys("manager");
	}
	public void btn()
	{
		logbtn.click();
	}
	

}
