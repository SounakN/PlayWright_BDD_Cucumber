package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
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
