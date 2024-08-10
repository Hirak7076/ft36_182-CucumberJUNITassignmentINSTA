package INSTArunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CUCUMBERjunitINSTAassignment\\src\\test\\resources\\INSTAfeature\\INSTA.feature",
		glue = "INSTAsteps"
		
		)

public class Runner {

}
