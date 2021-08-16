package co.com.choucair.certification.proyectoBase.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Link to Choucair University")
            .located(By.xpath("//div[@id='certificaciones']//Strong"));
    public static final Target INPUT_COURSE = Target.the("Input where we will write the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Button to search the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Link to the course")
            .located(By.xpath("//h4[@class='result-title']//a[contains(text(),'AiU Certified Tester in Artificial Intelligence (CTAI)')]"));
    public static final Target NAME_COURSE = Target.the("Extract name of course")
            .located(By.xpath("//div[@class='page-header-headings']//h1"));

}
