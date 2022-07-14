package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
import com.automation.PlayWrightBDD.PageObjects.FundsTransferPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FundTransferStepDef {
    private FundsTransferPage fundsTransferPage;
    private ContextPageUI contextPageUI;

        public FundTransferStepDef(ContextPageUI contextPageUI) {
            this.contextPageUI = contextPageUI;
        }


    @Then("Validate the title of the page in Fund Transfer to be {string}")
    public void validateTheTitleOfThePageInFundTransferToBe(String Title) {
        try{
            Assert.assertTrue(contextPageUI.fundsTransferPage.Validate_Presence_of_PageElement());
            String title = contextPageUI.fundsTransferPage.TitleValidation();
            Assert.assertTrue( title.equals(Title));
        }catch(Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
