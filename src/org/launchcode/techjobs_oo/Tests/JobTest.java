package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest{
    private Job jobOne, jobTwo, jobThree, jobFour, jobFive, jobSix;
    private int id;
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
        jobFive = new Job("Minister of Silly Walks", new Employer("Ministry of Silly Walks"), new Location("Old Blighty"), new PositionType("Silly Walker"), new CoreCompetency("Upper Class Twit"));
        jobSix = new Job("", new Employer (""), new Location (""), new PositionType (""), new CoreCompetency(""));
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
    public void toStringTest() {

        //When passed a Job object, it should return a string that contains a blank line before and after the job information.
        assertTrue(jobFive.toString().startsWith("\n"));
        assertTrue(jobFive.toString().endsWith("\n"));
    }
    @Test
    public void labelToString() {
        //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
        assertEquals(jobFive.toString(), '\n' + "ID: " + jobFive.getId() + '\n'
                    + "Name: " + jobFive.getName() + '\n'
                    + "Employer: " + jobFive.getEmployer() + '\n'
                    + "Location: " + jobFive.getLocation() + '\n'
                    + "Position Type: " + jobFive.getPositionType() + '\n'
                    + "Core Competency: " + jobFive.getCoreCompetency() + '\n');
        }

    @Test
    public void isEmptyString() {
    //If a field is empty, the method should add, “Data not available” after the label.
        String output =  "\n" +
                "ID: " + jobSix.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n"
                ;
        assertEquals(output, jobSix.toString());



//    //(Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
//        assertTrue("OOPS! This Job does not seem to exist", jobSix.getId() > 0 && jobSix.getName().isEmpty() &&
//                                                                    jobSix.getEmployer().toString().isEmpty() &&
//                                                                    jobSix.getLocation().toString().isEmpty() &&
//                                                                    jobSix.getPositionType().toString().isEmpty() &&
//                                                                    jobSix.getCoreCompetency().toString().isEmpty());
        }
    }
