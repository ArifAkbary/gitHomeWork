package steps;

import io.cucumber.java.en.When;
import pages.addEmployeePage;

import static steps.pageInitilize.dash;
import static utils.CommonMethods.click;
import static utils.CommonMethods.sendText;

public class addEmployeeStep {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dash.addEmployeeOption);
    }

    @When("user enters firstName, middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText(addEmployeePage.firstName, "gisel");
        sendText(addEmployeePage.middleName, "francis");
        sendText(addEmployeePage.lastName, "arif");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }


}
