package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn automation at the academy Choucair$")
    public void thanBrandomWants(){
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());

    }

    @When("^He search for the course Recursos Automatizacion Bancolombia on the Choucair academy plattaform $")

    public void heSearhForCourse(){

    }

    @Then("^he finds the course called resources Recuroso Automatizacion Bancolombia$")
    public void heFindsCourse(){

    }
}
