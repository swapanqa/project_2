package com.lordandtaylor.qa.scripts.junit.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Hema on  3/13/2018
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(
            //tags = { "@debug" },  /*only run tests tagged with whatever in curly braces, 1Dym array*/
            //tags = { "@smoke" },         /* smoke test only, 1 Dym array */
            // tags = { "@smoke,@debug" },   /* debug OR smoke test, note: 2 Dym array */
            //tags = { "@smoke","@debug" },  /* debug AND smoke test, note: 2 Dym array */
            //monochrome = true,
            //features = "src/test/resources/features/", //use this code to run everything or all features (on job may have 100s).
            features = "src/test/resources/features/LordAndTaylorSignIn.feature", //use this code to just run feature file.
            /*features = {"src/test/resources/features/LoginFunctionality2.feature", //use this code,with curly braces and comma, to run multiple feature files.
                    "src/test/resources/features/LoginFunctionality.feature"},*/
            glue = {//"com.shiftedtech.qa.framework.steps.hook", //use code to specify which steps file you want, in this case hook.
                    //"com.shiftedtech.qa.framework.steps", //use code to specify which steps file you want.
                    "com.lordandtaylor.qa.framework.steps"}, //use code to use all steps files.
            //dryRun = true,
            plugin={
                    "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                    "html:target/cucumber-test-report",
                    "json:target/cucumber-test-report/cucumber-report.json",
                    "junit:target/cucumber-test-report/test-report.xml"
            }
    )

//NOTE: plugin section is specifically for reporting purposes. All reporting shown here can be found in target folder ->cucumber-test-report->whatever file is there.
//just double click on file to see report. For html, right click on index.html -> Open in browser -> Chrome

    public class BDDRunnerJUnit {


    }
/*DOS syntax to run tagged tests in cmd:
   mvn clean test -Dcucumber.options="--tags @debug"                   //Only debug
   mvn clean test -Dcucumber.options="--tags @debug --tags @smoke"     //AND
   mvn clean test -Dcucumber.options="--tags @debug,@smoke"            //OR

 */

