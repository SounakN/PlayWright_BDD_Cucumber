package com.automation.PlayWrightBDD.StepDefinitions;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;
import com.automation.PlayWrightBDD.PageObjects.ContextPageUI;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass extends BrowserFactory {


    private Page page;
    private Browser browser;
    private BrowserFactory browserFactory;

    public BaseClass(BrowserFactory browserFactory){
        this.browserFactory =browserFactory;
    }

    @Before
    public void Initiation(Scenario sc){
        System.out.println(sc.getName() + " is being running at :: "+ Thread.currentThread().getId());
        browserFactory.init_Browser("Chrome");
        ContextPageUI.InitializePage(browserFactory);
    }


    @After
    public void TearDown(Scenario sc){
        browserFactory.closeBrowser();
    }
}
