package co.com.choucair.certifications.proyectbase;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= "src/test/resources/features/academyChoucair.feature",
        tags= "@Regresion",
        glue= "co.com.choucair.certification.proyectbase.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}

