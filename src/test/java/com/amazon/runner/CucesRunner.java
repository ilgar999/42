package com.amazon.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        monochrome = true,
        glue = "com/amazon/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@AS"

)
public class CucesRunner {
}
