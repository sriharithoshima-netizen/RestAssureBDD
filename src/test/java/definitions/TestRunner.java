package definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/resources/features",
        glue = {"definitions"},
        plugin = {"pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

   @Override
   @DataProvider(parallel = false)
   public Object[][] scenarios() {
      return super.scenarios();
   }
}