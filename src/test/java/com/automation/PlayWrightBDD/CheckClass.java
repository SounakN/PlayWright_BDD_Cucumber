package com.automation.PlayWrightBDD;

import com.microsoft.playwright.*;
import org.junit.Assert;

public class CheckClass {


    public static void main(String[] args) {
        try(Playwright playwright = Playwright.create())
        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


            BrowserContext userContext = browser.newContext();
            BrowserContext adminContext = browser.newContext();
            System.out.println();

            browser.contexts().stream().forEach(x->{
                Page page = x.newPage();
                page.navigate("https://parabank.parasoft.com/parabank/index.htm");
                String Title = page.title();
                System.out.println(Title);
                Assert.assertTrue(Title.equalsIgnoreCase("ParaBank | Welcome | Online Banking"));
                String URL1 = page.url();
                System.out.println(URL1);
                Assert.assertTrue(URL1.equalsIgnoreCase("https://parabank.parasoft.com/parabank/index.htm"));

                x.close();
            });

          /*  Page page1 = userContext.newPage();
            page1.navigate("https://parabank.parasoft.com/parabank/index.htm");

            Page page2 = adminContext.newPage();
            page2.navigate("https://parabank.parasoft.com/parabank/index.htm");

            String URL = page1.url();
            System.out.println(URL);
            Assert.assertTrue(URL.equalsIgnoreCase("https://parabank.parasoft.com/parabank/index.htm"));

            String Title = page1.title();
            System.out.println(Title);
            Assert.assertTrue(Title.equalsIgnoreCase("ParaBank | Welcome | Online Banking"));

            String URL1 = page2.url();
            System.out.println(URL1);
            Assert.assertTrue(URL1.equalsIgnoreCase("https://parabank.parasoft.com/parabank/index.htm"));

            String Title1 = page2.title();
            System.out.println(Title1);
            Assert.assertTrue(Title1.equalsIgnoreCase("ParaBank | Welcome | Online Banking"));
*/

            /*userContext.close();
            adminContext.close();*/
        }
    }
}
