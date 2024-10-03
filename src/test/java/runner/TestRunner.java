package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Telling Junit to run the TestRunner Class as a cucumber test.
@CucumberOptions(features = "src/test/resources/features/Invoices.feature",
                 glue = {"step_definitions", "Hooks"},//For Hooks, just need to provide the package name for the path.
                 plugin = {"pretty", "html:target/primetech-report.html"},
                 tags ="@AddNewInvoices"//"@Crater and @smoke" will specify more to the test scenario.
                 //monochrome = true
                 )

public class TestRunner {
    //This class will allow us to execute and run our feature files/step definitions.
}

