package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CommonLoginStepDef {

    private ContextPageUI contextPageUI;

    public CommonLoginStepDef(ContextPageUI contextPageUI) {
        this.contextPageUI = contextPageUI;
    }

    //Sting locators
    //private

    @Given("User navigate to the URL")
    public void userNavigateToTheURL() {
        try{
            Assert.assertTrue(contextPageUI.commonStepsPages.NavigateTo("https://parabank.parasoft.com/parabank/index.htm"));

        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }

    }
    @And("Validates the title of the page to be {string}")
    public void validatesTheTitleOfThePageToBe(String Title) {

        try{
           String title = contextPageUI.commonStepsPages.TitleValidation();
            Assert.assertTrue( title.equals(Title));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Then("user logs in with the User name {string} and Password {string}")
    public void userLogsInWithTheUserNameAndPassword(String userName, String password) {
        try{
            Assert.assertTrue(contextPageUI.commonStepsPages.login(userName,password));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

}
