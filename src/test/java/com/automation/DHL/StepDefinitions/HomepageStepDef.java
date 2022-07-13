package com.automation.DHL.StepDefinitions;

import com.automation.DHL.Driver.BrowserFactory;
import com.automation.DHL.PageObjects.CommonStepsPages;
import com.automation.DHL.PageObjects.ContextPageUI;
import com.automation.DHL.PageObjects.HomepagePage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomepageStepDef {


    private ContextPageUI contextPageUI;

    public HomepageStepDef(ContextPageUI contextPageUI) {
        this.contextPageUI = contextPageUI;
    }
    @Then("user Clicks on {string}")
    public void userClicksOn(String choice) {
        try{
            Assert.assertTrue(contextPageUI.homepagePage.choose_links(choice));
        }catch(Exception e)
        {

        }
    }


}
