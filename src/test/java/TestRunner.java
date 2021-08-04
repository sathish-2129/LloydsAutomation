import com.test.config.BasePage;
import cucumber.api.CucumberOptions;
import io.cucumber.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber",
                "json:target/cucumber-report.json"},
        glue = "com.test.stepDef",
        features = "src/test/resources/features")
public class TestRunner extends BasePage{
}
