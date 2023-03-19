package testrunner;


	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.Cucumber;
	import org.junit.runner.RunWith;
	//import org.testng.annotations.DataProvider;

	@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty","html:target/dsAlgo_ProjectReport.html"}, //reporting purpose
			monochrome=true,
			
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepdefinitions","appHooks","Utilities"
			      }//location of step definition files
			
	       )
	public class MyTestRunner {
	   
		
	    }



