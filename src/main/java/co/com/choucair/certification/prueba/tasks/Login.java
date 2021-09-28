package co.com.choucair.certification.prueba.tasks;


import co.com.choucair.certification.prueba.model.AcademyChoucairData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.prueba.userinterface.ChoucairLoginPage.*;


public class Login implements Task {

    AcademyChoucairData academyChoucairData;

    public Login(AcademyChoucairData academyChoucairData) {
        this.academyChoucairData = academyChoucairData;
    }

    public static Login onThePage(AcademyChoucairData academyChoucairData) {
        return Tasks.instrumented(Login.class,academyChoucairData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON),
                Enter.theValue(academyChoucairData.getStrUser()).into(INPUT_USER),
                Enter.theValue(academyChoucairData.getStrPassword()).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON));
    }
}
