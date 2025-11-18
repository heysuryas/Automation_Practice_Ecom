package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

    //initialise driver 
	private WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	// DECLARE ELEMENTS

@FindBy(xpath = "//li/a[contains(text(),'Signup / Login')]")
private WebElement signupbtn;

@FindBy(name="email")
private WebElement emailfld;

@FindBy(name="password")
private WebElement passwordfld;

@FindBy(xpath="//button[@type='submit']")
private WebElement loginbtn;


@FindBy(xpath = "//*[contains(text(),'Logged in as')]")
private WebElement loggedmsg;

	
	// METHODS

public void user_loginpage() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(signupbtn));
    signupbtn.click();
}

public void enterEmail(String email) {
    emailfld.clear();
    emailfld.sendKeys(email);
}
	
public void enterPassword(String password) {
    passwordfld.clear();
    passwordfld.sendKeys(password);
}

public void user_clicks_loginbtn() {
	loginbtn.click();
}

public boolean isHomePageVisible() {
	try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loggedmsg));
        return loggedmsg.isDisplayed();
    } catch(Exception e){
        return false;
    }

}
}