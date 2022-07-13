package com.automation.DHL.Driver;

public enum Browsers {

    CHROME,
    FIREFOX,
    SAFARI,
    EDGE,
    CHROMIUM;

    public static Browsers getDriver(String driverName)
    {
        return Browsers.valueOf(driverName.trim().toUpperCase());
    }

}
