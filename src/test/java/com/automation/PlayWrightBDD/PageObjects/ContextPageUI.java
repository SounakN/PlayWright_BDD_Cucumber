package com.automation.PlayWrightBDD.PageObjects;

import com.automation.PlayWrightBDD.Driver.BrowserFactory;

public class ContextPageUI  {

    public static PageInterface _commonStepsPages;
    public static PageInterface _fundsTransferPage;
    public static PageInterface _homepagePage;
    public static PageInterface _openAccountPage;
    public static PageInterface _accountsOverviewPage;
    public static PageInterface _requestLoanPage;

    public ContextPageUI() {
    }

    public static void InitializePage(BrowserFactory browserFactory){
        _commonStepsPages = () -> new CommonStepsPages(browserFactory);
        _fundsTransferPage = () -> new FundsTransferPage(browserFactory);
        _homepagePage = () -> new HomepagePage(browserFactory);
        _openAccountPage = () -> new OpenAccountPage(browserFactory);
        _accountsOverviewPage = () -> new AccountsOverviewPage(browserFactory);
        _requestLoanPage = () -> new ReuqestLoanPage(browserFactory);
    }

    public CommonStepsPages commonStepsPages = (CommonStepsPages) _commonStepsPages.get();
    public FundsTransferPage fundsTransferPage = (FundsTransferPage) _fundsTransferPage.get();
    public HomepagePage homepagePage = (HomepagePage) _homepagePage.get();
    public OpenAccountPage openAccountPage = (OpenAccountPage) _openAccountPage.get();

    public AccountsOverviewPage accountsOverviewPage = (AccountsOverviewPage) _accountsOverviewPage.get();
    public ReuqestLoanPage reuqestLoanPage = (ReuqestLoanPage) _requestLoanPage.get();
}
