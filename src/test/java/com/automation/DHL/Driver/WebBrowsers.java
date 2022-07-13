package com.automation.DHL.Driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public interface WebBrowsers {
    BrowserType.LaunchOptions setOptions();
    void setDriver();
    Browser getBrowser(Playwright playwright);
    void CloseBrowser();

}
