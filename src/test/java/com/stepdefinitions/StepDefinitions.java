package com.stepdefinitions;

import com.navigation.ActionsBrowser;

import com.tasks.AddToCartTask;
import com.tasks.ConfirmOrderTask;
import com.tasks.MakePurchaseTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
ActionsBrowser actionsBrowser;
AddToCartTask addToCartTask;
ConfirmOrderTask confirmOrder;
MakePurchaseTask makePurchase;

    @Given("user opens Blaze page")
    public void openPage() {

        actionsBrowser.openDemoBlazePage();
    }

    @When("user adds two item to cart")
    public void addItemToCart(){

        addToCartTask.AddAnotherItemToCart();
    }

    @And("user goes to Cart and confirm order")
    public void confirmProductsIntoCart(){

        confirmOrder.ConfirmIntoCart();
    }

    @Then("user completes the purchase")
    public void finalizePurchase(){

        makePurchase.fillForm();
        makePurchase.clickingPurchaseButton();
    }
}
