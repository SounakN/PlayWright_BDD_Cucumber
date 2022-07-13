package com.automation.DHL.Driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class Edge implements WebBrowsers {

    private Browser browser;
    private Playwright playwright;
    public Edge(){
    }

    @Override
    public LaunchOptions setOptions() {
        LaunchOptions options = new LaunchOptions();
        options.setHeadless(false);
        options.setChannel("msedge");
        return options;
    }

    @Override
    public void setDriver() {
        try{
            browser = playwright.chromium().launch(setOptions());
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
