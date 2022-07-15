package com.automation.PlayWrightBDD.PageObjects;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Response;

public class CommonStepsPages  implements PageInterface  {

  /*  private Page page;*/
    /*public CommonStepsPages(Page page) {
        this.page = page;
    }*/
    BrowserFactory browserFactory;
    public CommonStepsPages(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }

    //Locators
    private String Username = "//input[@name='username']";
    private String Password = "//input[@name='password']";
    private String Button = "//input[@value='Log In']";


    public boolean NavigateTo(String URL){
        try{
            Response res =  browserFactory.getPage().navigate(URL);
            return res.status()==200;
        }catch(Exception e)
        {
           e.printStackTrace();
           return false;
        }
    }



    public String TitleValidation(){
        try{
           String titleFound = browserFactory.getPage().title();
           return titleFound;
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public Boolean login(String username, String password)
    {
        try{
            Locator button_Loc = browserFactory.getPage().locator(Button);

            browserFactory.getPage().type(Username,username);
            browserFactory.getPage().type(Password,password);
            button_Loc.click();

            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


}
