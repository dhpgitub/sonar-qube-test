package com.deanhealth.test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,
        features="src/test/resources/features/",
        dryRun=false,plugin={"pretty","html:build/cucumber-html-report.html","json:build/cucumber-report.json"}
)
public class Runner {
}
