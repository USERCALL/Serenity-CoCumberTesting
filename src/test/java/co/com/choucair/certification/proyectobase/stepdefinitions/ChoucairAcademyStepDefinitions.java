package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the Academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage("1032491411","Choucair2021*"));
    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseMetodologiaBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesMetodologíaBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }




    @Given("^than Rose want to learn automation at the Academy choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), Login
                .onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }


    @When("^she search for the course  on the Choucair Academy platform$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called$")
    public void sheFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
