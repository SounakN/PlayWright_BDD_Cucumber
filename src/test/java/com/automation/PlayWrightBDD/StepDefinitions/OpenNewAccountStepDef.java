package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OpenNewAccountStepDef {

    private ContextPageUI contextPageUI;

    public OpenNewAccountStepDef(ContextPageUI contextPageUI) {
        this.contextPageUI = contextPageUI;
    }
    @Then("Validate the title of the page in Open Account to be {string}")
    public void validateTheTitleOfThePageInOpenAccountToBe(String Title) {
        try{
            Assert.assertTrue(contextPageUI.openAccountPage.Validate_Presence_of_PageElement());
            String title = contextPageUI.openAccountPage.TitleValidation();
            Assert.assertTrue( title.equals(Title));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
