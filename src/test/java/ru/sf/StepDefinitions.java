package ru.sf;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
@Given("today is {string}")
    public void today_is(String string){
    throw new io.cucumber.java.PendingException();
}
@When("I ask about whether it's Friday yet")
    public void i_ask_about_whether_it_s_friday_yet(){
    throw new io.cucumber.java.PendingException();
}
@Then("I should be told {string}")
    public void i_should_be_told(String string){
    throw new io.cucumber.java.PendingException();
}
}
