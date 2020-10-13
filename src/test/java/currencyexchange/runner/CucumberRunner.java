package currencyexchange.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        glue = "src/test/currencyexchange/test",
        features="/Users/ptuptewar/Downloads/HSBC_Assignment/resources",
        plugin={"pretty","json:target/"})

public class CucumberRunner extends AbstractTestNGCucumberTests {
}