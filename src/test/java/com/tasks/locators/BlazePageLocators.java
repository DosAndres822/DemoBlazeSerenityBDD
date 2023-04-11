package com.tasks.locators;

import org.openqa.selenium.By;

public class BlazePageLocators {

    public static final By BTNADDTOCART = By.linkText("Add to cart");
    public static final By LINKHOME = By.xpath("//a[contains(text(),'Home')]");
    public static final By LINKCART = By.linkText("Cart");
    public static final By LINKDELETE = By.linkText("Delete");
    public static final By BTNPLACEORDER = By.xpath("//button[contains(text(),'Place Order')]");
    public static final By FROMNAME = By.id("name");
    public static final By FROMCOUNTRY = By.id("country");
    public static final By FROMCITY = By.id("city");
    public static final By FROMCREDITCARD = By.id("card");
    public static final By FROMMONTH = By.id("month");
    public static final By FROMYEAR = By.id("year");
    public static final By BTNPURCHASE = By.xpath("//button[contains(text(),'Purchase')]");
    public static final By BTNOKPURCHASE = By.xpath("//button[contains(text(),'OK')]");




}
