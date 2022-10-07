package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions", //stepDefinitions class'inin yolunu aldip buraya attik
                                 // isminede glue(yapistirici) dedik
        tags = "@gp1",          // Runner class'ndan hangisini calistirmak istersek buraya
        dryRun = false          // eksik olan adimlari olusturmasi icin
)

public class Runner {
    /*
    runner class'ı TestNg'deki XML mantıgı ile calısır.
     */

}
