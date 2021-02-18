package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/jenkinstest.feature"
        , plugin = {"pretty", "html:target/cucumber", "json:target/cucumberJenkins.json", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
        , tags = "@Jenkins"
        , glue = "")
public class JenkinsTest {
}
