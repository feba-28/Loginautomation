package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSLoginpage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/div/div/a[2]")
	WebElement AccIcon;
	@FindBy(xpath = "//*[@id=\"customer[email]\"]")
	WebElement emailFld;
	@FindBy(xpath = "//*[@id=\"customer[password]\"]")
	WebElement pswdFld;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/button/span[1]")
	WebElement LoginBtn;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--21715383550253__main\"]/section/div[1]/div/div/ul/li[3]/a")
	WebElement Logout;
	
	
	
	

	
	
	public SSLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 public void AccountBtn()
	 {
		 AccIcon.click();
	
	 }
	 public void setlogincred(String email, String pswd) throws InterruptedException
		{
		 Thread.sleep(2000);
			emailFld.clear();
		    pswdFld.clear();
			emailFld.sendKeys(email);
			pswdFld.sendKeys(pswd);
			
			 LoginBtn.click();
		Thread.sleep(2000);
		}
	 public void Logoutfn()
	 {
		 Logout.click();
	 }
	
	
}



