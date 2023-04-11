package com.tasks;

import com.tasks.locators.BlazePageLocators;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;


public class ConfirmOrderTask extends UIInteractionSteps {
    @Step
    public void ConfirmIntoCart() {
        $(BlazePageLocators.LINKCART).click();
        ListOfWebElementFacades numitems = $$(BlazePageLocators.LINKDELETE);
        System.out.printf("Este es el numero de items"+ numitems.size());
        Assertions.assertThat(numitems.size()).as("Check there are 2 items in cart").withFailMessage("Items are different to 2").isEqualTo(2);
        $(BlazePageLocators.BTNPLACEORDER).waitUntilClickable().click();

    }
}
