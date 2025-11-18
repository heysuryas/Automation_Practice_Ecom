package Steps;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Hooks.Hooks;

import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
	 Loginpage loginPage;
	 
	 @Given("User launches the browser")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
	        loginPage = new Loginpage(Hooks.driver);
	    }
	 
	 @When("User click on 'Signup or Login' button")
	 public void user_clickloginbtn_() {
		 loginPage.user_loginpage();
	        // pass the driver created in Hooks 
		 }
	 @When("User enters login credentials")
	 public void user_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) {

	     List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	     String email = data.get(0).get("email");
	     String password = data.get(0).get("password");

	     loginPage.enterEmail(email);
	     loginPage.enterPassword(password);
	 }
	 @And("User clicks on Login button")
	 public void login_click() {
	 loginPage.user_clicks_loginbtn();
	 }
	 
	@Then("User should be able to view the user page")
	 public void user_in_homepage() {
		  Assert.assertTrue(loginPage.isHomePageVisible(), "Home page is not visible!");
		 
		  
		  
		 }
}
