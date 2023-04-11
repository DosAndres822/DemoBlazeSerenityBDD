package com.navigation;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ActionsBrowser extends UIInteractionSteps{
DemoBlazeHomePage demoBlazeHomePage;

   @Step
   public void openDemoBlazePage(){

      demoBlazeHomePage.open();
   }
}