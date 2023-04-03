package com.answer.royalMail.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"com.answer.royalMail.stepImplementation"},
    monochrome = true,
    plugin = {
      "pretty",
      "json:target/jsonReport/cucumber.json",
      "html:target/htmlReport/cucumber-reports.html"
    })
public class TestRunner {}
