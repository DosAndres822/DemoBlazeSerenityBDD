package com.tasks;

import com.tasks.locators.BlazePageLocators;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;


public class MakePurchaseTask extends UIInteractions {
    @Step
    public void fillForm() {
        $(BlazePageLocators.FROMNAME).waitUntilEnabled().sendKeys("Carlos Lombana");
        $(BlazePageLocators.FROMCOUNTRY).sendKeys("Peru");
        $(BlazePageLocators.FROMCITY).sendKeys("Lima");
        $(BlazePageLocators.FROMCREDITCARD).sendKeys("456213568795");
        $(BlazePageLocators.FROMMONTH).sendKeys("Abril");
        $(BlazePageLocators.FROMYEAR).sendKeys("2023");


    }
    @Step
    public void clickingPurchaseButton(){
        $(BlazePageLocators.BTNPURCHASE).click();
        $(BlazePageLocators.BTNOKPURCHASE).waitUntilClickable().click();

    }
}
