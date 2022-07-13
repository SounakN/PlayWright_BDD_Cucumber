package com.automation.DHL.PageObjects;

import com.automation.DHL.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class FundsTransferPage  implements PageInterface {

    private Page page;

    /*public FundsTransferPage(Page page) {
        this.page = page;
    }*/
    BrowserFactory browserFactory;
    public FundsTransferPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    public Boolean Validate_Presence_of_PageElement(){
        try{
            Locator pageheader = browserFactory.getPage().locator("text = Transfer Funds");
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
    public FundsTransferPage get() {
        return null;
    }
}
