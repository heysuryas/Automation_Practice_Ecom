package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.Hooks;
import Pages.ProductSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearch_steps {
	   WebDriver driver;
	   ProductSearch productsearch;
	   
	   
    @Given("User in homepage")
    public void user_is_on_homepage() {
    	driver = Hooks.driver;   // get active driver
        productsearch = new ProductSearch(driver);  // initialize page object     
    }
    @When("User clicks on Products button and view all product details")
    public void user_click_productbtn() {
    	productsearch.productbtn_click();
    	 Assert.assertTrue(productsearch.AllProduct_displayed(), "All products displayed!");	
    }
    @And("User enters product name")
    public void user_enter_prodname() {
    	productsearch.product_name();
    }
    @And("user clicks search button")
    public void user_click_searhbtn() {
    	productsearch.click_search();
    }
    @Then("user able to view searched products.")
    public void searchproduct_isdisplayed() {
    	Assert.assertTrue(productsearch.SelectedProduct_isdisplayed(), "Selected product is displayed!");	
    }
    
    
    
    
}
