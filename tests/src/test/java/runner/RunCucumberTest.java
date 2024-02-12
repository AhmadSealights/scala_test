package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/api_test.feature",
        glue = "steps"
//        plugin = {"pretty", "html:build/reports/tests/test"}
)
public class RunCucumberTest {
}