package com.tasks;

import com.tasks.locators.BlazePageLocators;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartTask extends UIInteractionSteps {


    private void AddTwoItemsIntoCart(String productName) {
        $(BlazePageLocators.LINKHOME).waitUntilClickable().click();
        $(By.linkText(productName)).click();
        $(BlazePageLocators.BTNADDTOCART).click();
        waitFor(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }

    @Step
    public void AddAnotherItemToCart() {
        AddTwoItemsIntoCart("Samsung galaxy s6");
        AddTwoItemsIntoCart("Sony vaio i5");
    }

}
