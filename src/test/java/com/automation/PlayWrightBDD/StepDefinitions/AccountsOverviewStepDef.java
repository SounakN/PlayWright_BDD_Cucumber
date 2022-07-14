package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountsOverviewStepDef {

    private ContextPageUI contextPageUI;

    public AccountsOverviewStepDef(ContextPageUI contextPageUI) {
        this.contextPageUI = contextPageUI;
    }


    @Then("Validate the title of the page in Accounts Overview to be {string}")
    public void validateTheTitleOfThePageInAccountsOverviewToBe(String Title) {
        try{
            Assert.assertTrue(contextPageUI.accountsOverviewPage.Validate_Presence_of_PageElement());
            String title = contextPageUI.accountsOverviewPage.TitleValidation();
            Assert.assertTrue( title.equals(Title));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
