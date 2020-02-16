package br.com.serasaExperian;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import br.com.serasaExperian.core.Driver;



@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.serasaExperian" }, features = {
		"src/main/java/br/com/serasaExperian/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" }, tags = { "~@ignore", "@geral" })

public class Runner {
	@AfterClass
	public static void encerraTeste() {
		// Driver.encerraDriver();
	}

}
