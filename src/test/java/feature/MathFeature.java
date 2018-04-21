package feature;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class MathFeature
{
    private int initial = 0;

    @Given ("^I have number (-?\\d+)$")
    public void initialNumber(int initial)
    {
        this.initial = initial;
    }

//    @When("I substract (-?\\\\d+)$")
//    public void subTract(int number){
//        this.initial -= number;
//    }

    @When ("I subtract numbers (.*)")
    public void subtract(List<Integer> numbers)
    {
        for (int number:numbers){
            this.initial -= number;
        }
    }

    @When ("I subtract set")
    public void subtract(DataTable numbers)
    {
        for (Integer number:numbers.asList(Integer.class)){
            this.initial -= number;
        }
    }


    @When ("^I subtract numbers:$")
    public void subTrac(List<Integer> numbers)
    {
        for (int number:numbers){
            this.initial -= number;
        }
    }

    @Then ("^I get (-?\\d+)$")
    public void operationResult(int expected)
    {
        assertThat(initial, equalTo(expected));
    }
}