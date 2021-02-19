package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest{
    private Job jobOne, jobTwo, jobThree, jobFour, jobFive;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    @Before
    public void JobTestObjects() {
        jobOne = new Job();
        jobTwo = new Job();
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFive = new Job();

    }
    @Test
    public void testSettingJobId() {
        assertEquals(1, jobTwo.getId() - jobOne.getId(), .001);
        assertTrue(String.valueOf(true), jobTwo.getId() > jobOne.getId());
        assertFalse(String.valueOf(false), jobOne.getId() == jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(true, jobThree instanceof Job);
        assertEquals(true, jobThree.getEmployer() instanceof Employer);
        assertEquals(true, jobThree.getLocation() instanceof Location);
        assertEquals(true, jobThree.getPositionType() instanceof PositionType);
        assertEquals(true, jobThree.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality() {
        assertEquals(false, jobThree.equals(jobFour));
    }

    @Test
    public void toStringTest(){

        //When passed a Job object, it should return a string that contains a blank line before and after the job information.
            assertTrue(jobFive.toString().startsWith("\n"));
            assertTrue(jobFive.toString().endsWith("\n"));
//
////        //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//            assertTrue(jobFive.toString().contains());
//
//            //If a field is empty, the method should add, “Data not available” after the label.
//            assertTrue(jobFive.toString().endsWith("\n"));

            //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//        assertTrue("\nID: " + "\nName: + \nEmployer: + \nLocation: + \nPositionType: + \nCoreCompetency: + \n");
//

            //If a field is empty, the method should add, “Data not available” after the label.
//        assertTrue(jobThree.toString().contains());


            //(Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
//        assertTrue(jobFive. );
//
        }
    }
