package com.automation.PlayWrightBDD.PageObjects;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;

public class OpenAccountPage implements PageInterface {

    /*private Page page;*/

    BrowserFactory browserFactory;
    public OpenAccountPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    public Boolean Validate_Presence_of_PageElement(){
        try{
            Locator pageheader = browserFactory.getPage().locator("text = Open New Account");
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
