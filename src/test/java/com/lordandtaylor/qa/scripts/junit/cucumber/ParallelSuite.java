package com.lordandtaylor.qa.scripts.junit.cucumber;

import com.lordandtaylor.qa.scripts.junit.cucumber.functional.LordandTaylorCartTestJUnit;
import com.lordandtaylor.qa.scripts.junit.cucumber.functional.LordandTaylorLoginJUnit;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

/**
 * @author Hema on  4/5/2018
 * Need this class to run test in parallel at same time.
 * It contains 1 test, but it will run 2 tests, 1 in Chrome and 1 in FireFox browsers (in 2 threads).
 * note: to run test in Sequential operation, run from the test.java file.
 * Note: when you run in parallel, you won't get any log unless something fail.
 * BrowserStack.com will show detailed log (steps) of your scripts that ran in TextLogs section (only for CloudTesting broswers though).
 * But will not show if something failed. If anything failed, it will show up in your IDE.
 *
 */
public class ParallelSuite {

    @Test
    public void parallelTest() {
        Class[] cls = {LordandTaylorCartTestJUnit.class}; //Array of how many script we want to execute (just 1 for now).

        //JUnitCore.runClasses(ParallelComputer.classes(),cls);
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }

}
