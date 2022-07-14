package com.automation.PlayWrightBDD.Driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class Chromium implements WebBrowsers {

    private Browser browser;
    private Playwright playwright;
    public Chromium(){
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
