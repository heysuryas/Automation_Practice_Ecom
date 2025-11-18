package Pages;

import java.time.Duration;

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

@FindBy(name="name")
private WebElement namefld;

@FindBy(name="email")
private WebElement emailfld;

@FindBy(id="message")
private WebElement msgfld;

@FindBy(id="")
private WebElement contactPagetitle;

}


