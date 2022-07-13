package com.automation.DHL.StepDefinitions;

import com.automation.DHL.PageObjects.ContextPageUI;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RequestLoanStepDef {

    private ContextPageUI contextPageUI;

    public RequestLoanStepDef(ContextPageUI contextPageUI) {
        this.contextPageUI = contextPageUI;
    }


    @Then("Validate the title of the page in Request Loan to be {string}")
    public void validateTheTitleOfThePageInRequestLoanToBe(String Title) {
        try{
            Assert.assertTrue(contextPageUI.reuqestLoanPage.Validate_Presence_of_PageElement());
            String title = contextPageUI.reuqestLoanPage.TitleValidation();
            Assert.assertTrue( title.equals(Title));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
