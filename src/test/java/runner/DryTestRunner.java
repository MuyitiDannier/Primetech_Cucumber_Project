package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Telling Junit to run the TestRunner Class as a cucumber test.
@CucumberOptions(features = "src/test/resources/features/Invoices.feature",
                 glue = "step_definitions",
                 plugin = {"pretty", "html:target/primetech-report.html"},
                 dryRun = true //dryRun=true allows all codes to be executed and highlights the ones with problems
                 )

public class DryTestRunner {
    //This class will allow us to execute and run our feature files/step definitions.

}

