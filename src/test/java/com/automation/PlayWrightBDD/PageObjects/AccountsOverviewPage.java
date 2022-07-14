package com.automation.PlayWrightBDD.PageObjects;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AccountsOverviewPage implements PageInterface {

    private Page page;

    /*public FundsTransferPage(Page page) {
        this.page = page;
    }*/
    BrowserFactory browserFactory;
    public AccountsOverviewPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    public Boolean Validate_Presence_of_PageElement(){
        try{
            Locator pageheader = browserFactory.getPage().locator("text = Accounts Overview");
            return pageheader!=null;
        }catch(Exception e)
        {
            return false;
        }
    }
    public String TitleValidation(){
        try{
            return  browserFactory.getPage().title();
        }catch(Exception e)
        {
            return null;
        }
    }


    @Override
    public AccountsOverviewPage get() {
        return null;
    }
}
