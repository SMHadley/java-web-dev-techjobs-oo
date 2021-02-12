package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job jobOne, jobTwo, jobThree, jobFour;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    @Before
    public void JobTest() {
        jobOne = new Job();
        jobTwo = new Job();
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId() {
        assertEquals(1, jobTwo.getId() - jobOne.getId());
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
}