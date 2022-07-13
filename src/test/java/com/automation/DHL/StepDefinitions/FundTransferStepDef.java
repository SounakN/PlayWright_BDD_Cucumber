package com.automation.DHL.StepDefinitions;

import com.automation.DHL.Driver.BrowserFactory;
import com.automation.DHL.PageObjects.ContextPageUI;
import com.automation.DHL.PageObjects.FundsTransferPage;
import com.automation.DHL.PageObjects.OpenAccountPage;
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
