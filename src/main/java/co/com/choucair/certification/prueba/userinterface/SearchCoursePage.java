package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target COURSES_BUTTON = Target.the(" Button to search courses ")
            .located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the(" Search courses ")
            .located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the(" Button to search course Guias Tecnicas Analista Financial ")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target COURSE_BUTTON = Target.the(" Button go to course Guias Tecnicas Analista Financial ")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the(" extract course name ")
            .located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}

