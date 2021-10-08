package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to the login")
            .located(By.xpath("(//a[@class='btn btn-info btn-sm text-white'][contains(.,'Ingresar')])[1]"));

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to the confirm login")
            .located(By.xpath("//button[@type='submit'][contains(.,'Acceder')]"));
}
