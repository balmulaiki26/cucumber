package stepDef;






import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features"},
        glue= {"stepDef"},plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"})

public class Runner extends AbstractTestNGCucumberTests {

}
  //plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
          //"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
      //    "junit:target/cucumber-results.xml"})