package com.automation.DHL.PageObjects;

import com.automation.DHL.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomepagePage  implements PageInterface {
    /*private  Page page;
*/
    BrowserFactory browserFactory;
    public HomepagePage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    private String Open_Account = "//a[text()='Open New Account']";
    private String Accounts_Overview = "//a[text()='Accounts Overview']";
    private String Transfer_Funds = "//a[text()='Transfer Funds']";
    private String Request_Loan = "//a[text()='Request Loan']";

    public Boolean choose_links(String choice){
        try{
            switch(choice){
                case "Open New Account":
                    browserFactory.getPage().locator(Open_Account).click();
                    break;
                case "Accounts Overview":
                    browserFactory.getPage().locator(Accounts_Overview).click();
                    break;
                case "Transfer Funds":
                    browserFactory.getPage().locator(Transfer_Funds).click();
                    break;
                case "Request Loan":
                    browserFactory.getPage().locator(Request_Loan).click();
                    break;

            }

            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public PageInterface get() {
        return null;
    }
}
