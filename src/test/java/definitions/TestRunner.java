package definitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       features= "src/resources/features",
       glue= {"definitions"},
       plugin= {"pretty"}
   )
public class TestRunner {
}
