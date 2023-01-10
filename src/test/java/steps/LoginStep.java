package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {


    @Given("I navigate to the login page of an application")
    public void iNavigateToTheLoginPageOfAnApplication() {
        System.out.println("I navigate to the login page of an application");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("I click login button");
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }

    @And("I enter username and password")
    public void iEnterUsernameAndPassword(DataTable dataTable) {
        System.out.println(dataTable.asLists().get(1).get(0));
    }
}
