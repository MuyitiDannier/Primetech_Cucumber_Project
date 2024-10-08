package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.List;

public class DataTable_Example_StepDef {

    @Given("I have the following list of fruits")
    public void i_have_the_following_list_of_fruits(DataTable dataTable) {
        List<String> fruitNameList = dataTable.asList(); //this will take the values of List in feature file and make a List
        for(String fruit : fruitNameList){
            System.out.println(fruit);
        }
    }
    @When("I go to the market")
    public void i_go_to_the_market() {

    }
    @Then("I should have {int} fruits in my basket")
    public void i_should_have_fruits_in_my_basket(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
