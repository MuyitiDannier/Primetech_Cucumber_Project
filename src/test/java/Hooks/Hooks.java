package Hooks;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void beforeScenario(){
        Driver.getDriver().manage().window().maximize();
        System.out.println("Run before each scenario.");
    }

    @After
    public void afterScenario(){

    }

    @BeforeStep
    public void beforeStep(){

    }

    @AfterStep
    public void afterStep(){

    }

    @After
    public void Items_StepDef() throws InterruptedException {
    Thread.sleep(5000);
    Driver.getDriver().close();
    }

}


