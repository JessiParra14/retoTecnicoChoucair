package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.Join;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestStepDefinitions {

    @Before
    public void seStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jessica wants to register on the uTest page$")
    public void jessicaWantsToRegisterOnTheUTestPage() {
        OnStage.theActorCalled("Jessica").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }

    @When("^she clicks the JoinToday button$")
    public void sheClicksTheJoinTodayButton() {

    }

    @Then("^she enters all the data requested to register$")
    public void sheEntersAllTheDataRequestedToRegister() {

    }
}
