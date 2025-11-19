package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsForm {

    //initialise driver 
	private WebDriver driver;

    public ContactUsForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	// DECLARE ELEMENTS

    
@FindBy(xpath="//li/a[contains(text(),' Contact us')]")
private WebElement contactbtn;

@FindBy(name="name")
private WebElement namefld;

@FindBy(name="email")
private WebElement emailfld;

@FindBy(name="subject")
private WebElement subjectfld;

@FindBy(id="message")
private WebElement msgfld;

@FindBy(id="upload_file")
private WebElement uploadfld;

@FindBy(xpath="//h2[contains(text(),'Get In Touch')]")
private WebElement contactPagetitle;

@FindBy(xpath="//div[contains(@class,'alert-success') and contains(text(),'Success')]")
private WebElement confirmmsg;

@FindBy(name="submit")
private WebElement submitbtn;




//Methods

public void contactus_click() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
    wait.until(ExpectedConditions.visibilityOf(contactbtn));
	contactbtn.click();
	
}

public boolean contactpagedisplayed() {
	try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contactPagetitle));
        return contactPagetitle.isDisplayed();
    } catch(Exception e){
        return false;
    }
}
	public void enterContactFormDetails(String name, String email, String subject, String message) {
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(namefld));
	    
	    namefld.clear();
	    namefld.sendKeys(name);
	    
	    emailfld.clear();
	    emailfld.sendKeys(email);
	    
	    subjectfld.clear();
	    subjectfld.sendKeys(subject);
	    
	    msgfld.clear();
	    msgfld.sendKeys(message);
	}


// Skipping upload file logic - Confidentiality 
//   public void uploadfile() {
//	   uploadfld.sendKeys("");
//   }
	
	
	public void submit_click() {
		submitbtn.click();
	}
	
	public boolean isconfmsg_isdisplayed() {
		try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(confirmmsg));
	        return confirmmsg.isDisplayed();
	    } catch(Exception e){
	        return false;
	    }
	
	}
	

	public void handlePopup() {

		try {
	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert appeared: " + alert.getText());
	        alert.accept();  // click OK
	    } catch (NoAlertPresentException e) {
	        // No popup, continue
	    }
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	

}




















