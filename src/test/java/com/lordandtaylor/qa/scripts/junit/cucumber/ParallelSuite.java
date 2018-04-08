package com.lordandtaylor.qa.scripts.junit.cucumber;

import com.lordandtaylor.qa.scripts.junit.cucumber.functional.LordandTaylorCartTestJUnit;
import com.lordandtaylor.qa.scripts.junit.cucumber.functional.LordandTaylorLoginJUnit;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

/**
 * @author Hema on  4/5/2018
 NOTE: ParallelSuite not working. Need to fix.
 */
public class ParallelSuite {

    @Test
    public void parallelTest() {
        Class[] cls = {LordandTaylorCartTestJUnit.class}; //Array of how many script we want to execute (just 1 for now).

        //JUnitCore.runClasses(ParallelComputer.classes(),cls);
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }

}
