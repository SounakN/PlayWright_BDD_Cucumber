package com.automation.DHL.Driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    private  WebBrowsers webBrowsers;
    public static ThreadLocal<Browser> tlbrowser = new ThreadLocal<>();
    public static ThreadLocal<BrowserContext> tlbrowserContext = new ThreadLocal<>();
    public static ThreadLocal<Playwright> tlplaywright = new ThreadLocal<>();
    public static ThreadLocal<Page> tlPage = new ThreadLocal<>();

    String check;
    public BrowserFactory(){
    }
    private Playwright playwright;

    public synchronized Browser getBrowser()
    {
        return tlbrowser.get();
    }
    public synchronized BrowserContext getBrowserContext()
    {
        return tlbrowserContext.get();
    }
    public synchronized Page getPage()
    {
        return tlPage.get();
    }
    public synchronized Playwright getPlaywright()
    {
        return tlplaywright.get();
    }

    public void init_Browser(String browserName) {

        if(webBrowsers==null)
        {
            Browsers Browser = Browsers.getDriver(browserName);
            tlplaywright.set(Playwright.create());
            switch (Browser) {

                case CHROME:
                    webBrowsers = new Chrome();
                    break;
                case FIREFOX:
                    webBrowsers = new Firefox();
                    break;
                case EDGE:
                    webBrowsers = new Edge();
                    break;
                case CHROMIUM:
                    webBrowsers = new Chromium();
                    break;
            }

            tlbrowser.set(webBrowsers.getBrowser(getPlaywright()));
            launchBrowser();
        }

    }

    public Page launchBrowser(){
        tlbrowserContext.set(getBrowser().newContext());
        tlPage.set(getBrowserContext().newPage());

        return getPage();
    }
    public void closeBrowserContext(){
        getBrowserContext().close();
    }
    public void closeBrowser(){
        getBrowser().close();
        getPlaywright().close();
        webBrowsers=null;
    }


}
