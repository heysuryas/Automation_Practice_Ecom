package Steps;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Hooks.Hooks;
import Pages.ContactUsForm;
import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ContactUsform_Steps {
	 ContactUsForm contactform;
	 
@Given("User on homepage")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
		 contactform = new ContactUsForm(Hooks.driver);
		 Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://automationexercise.com/"));
}
@When("User clicks on contact us button")
public void User_clicks_contactbtn() {
	contactform.contactus_click();
	Assert.assertTrue(contactform.contactpagedisplayed(), "Contact Page tiltle is not displayed");
	
}
@And("User enters below details")
public void user_enters_below_details(io.cucumber.datatable.DataTable dataTable) {

    List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

    for (Map<String, String> row : rows) {
        
        String name = row.get("Name");
        String email = row.get("Email");
        String subject = row.get("Subject");
        String message = row.get("Message");

        // Call your Page class method
        contactform.enterContactFormDetails(name, email, subject, message);
    }
}

@And("User clicks on submit button")
public void User_clicks_submitbtn() {	
	contactform.submit_click();
	contactform.handlePopup();
}

@Then("User able to view Success message")
public void User_confmsg_isdisplayed() {
	  Assert.assertTrue(contactform.isconfmsg_isdisplayed(), "Confirmation message is not displayed");
}
	 
}









