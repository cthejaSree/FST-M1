package Test_Runner_Files;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "FEATURES",
    glue = {"Step_Definitions"},
    tags = "@activity1"
)

public class Activity1_Runfile {
	//empty

}
