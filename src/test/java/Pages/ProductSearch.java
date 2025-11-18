package Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearch {

    //initialise driver 
	private WebDriver driver;

    public ProductSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // elements
    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement productbtn;
    
    @FindBy(id="search_product")
    private WebElement productsearchfld;
    
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    private WebElement Allproductsdata;
    
    @FindBy(id = "submit_search")
    private WebElement searchbtn;
    
    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    private WebElement searchdata;
 
  
    // Methods 
    public void user_on_homepage() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productbtn)); 
    }
    
    public void productbtn_click() {
    	productbtn.click();
    }
    public void product_name() {
    	productsearchfld.clear();
    	productsearchfld.sendKeys("Blue Top");
    }
    public void click_search() {
    	searchbtn.click();
    }
    
    public boolean AllProduct_displayed() {
    	try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(Allproductsdata));
            return Allproductsdata.isDisplayed();
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean SelectedProduct_isdisplayed() {
    	    	try {
    	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	            wait.until(ExpectedConditions.visibilityOf(searchdata));
    	            return searchdata.isDisplayed();
    	        } catch(Exception e){
    	            return false;
    	        }}
    	

}