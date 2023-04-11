package com;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
plugin = {
  "pretty",
  "html:target/serenity-reports//serenity-html-report",
  "json:target/serenity-reports/cucumber_report.json"
},
features = "src/test/resources/features")

public class RunerDemoBlazeTestSuite {

}


