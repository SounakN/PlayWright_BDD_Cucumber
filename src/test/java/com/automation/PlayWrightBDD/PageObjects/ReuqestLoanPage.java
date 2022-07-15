package com.automation.PlayWrightBDD.PageObjects;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;

public class ReuqestLoanPage implements PageInterface {

    /*private Page page;*/

    BrowserFactory browserFactory;
    public ReuqestLoanPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    public Boolean Validate_Presence_of_PageElement(){
        try{
            Locator pageheader = browserFactory.getPage().locator("text = Apply for a Loan");
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

}
