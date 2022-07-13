package com.automation.DHL.Driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class Firefox implements WebBrowsers {

    private Browser browser;
    private Playwright playwright;
    public Firefox(){
    }

    @Override
    public LaunchOptions setOptions() {
        LaunchOptions options = new LaunchOptions();
        options.setHeadless(false);
        return options;
    }

    @Override
    public void setDriver() {
        try{
            browser = playwright.firefox().launch(setOptions());
        }catch(Exception e){

        }
    }

    @Override
    public Browser getBrowser(Playwright playwright) {
        if(browser==null)
        {
            this.playwright = playwright;
            setDriver();
        }

        return browser;
    }
    @Override
    public void CloseBrowser() {
        browser.close();
        browser=null;
    }

}
