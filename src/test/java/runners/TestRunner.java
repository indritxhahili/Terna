package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       
        features = "src/test/resources/features",
        glue= {"step_definitions"},
        plugin = { "html:target/cucumber-report.html",
               "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",},
        monochrome = true,
        tags = "@RF51LineeAereeCampate"
        //publish = true
)

public class TestRunner {

}
