package co.com.choucair.certification.prueba.tasks;


import co.com.choucair.certification.prueba.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.prueba.userinterface.SearchCoursePage.*;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search theCourse(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COURSES_BUTTON),
                Enter.theValue(course).into(INPUT_COURSE),
                Click.on(GO_BUTTON),
                Click.on(COURSE_BUTTON));

    }
}
