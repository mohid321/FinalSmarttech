package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources",

                  glue = { "stepdef" },//packege name
                  
                  tags = { " @test001" },// regeration test or smoke test
                  
                  plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/report/report.html" },
  
                  monochrome = true
                		  )
public class Junit {

}
