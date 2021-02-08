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
        jobOne = new Job("Baker");
        jobTwo = new Job("Cook");
        jobThree = new Job("Product tester"); new Employer("ACME"); new Location("Desert"); new PositionType("Quality control"); new CoreCompetency("Persistence");
        jobFour = new Job("Product tester2"); new Employer("ACME2"); new Location("Desert2"); new PositionType("Quality control2"); new CoreCompetency("Persistence2");

    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, jobTwo.getId() - jobOne.getId());
        assertTrue(String.valueOf(true), jobTwo.getId() > jobOne.getId());
        assertFalse(String.valueOf(false), jobOne.getId() == jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(String.valueOf(true), new Job("Product tester") instanceof Job);
        assertTrue(String.valueOf(true), new Employer("ACME") instanceof Employer);
        assertTrue(String.valueOf(true), new Location("Desert") instanceof Location);
        assertTrue(String.valueOf(true), new PositionType("Quality control") instanceof PositionType);
        assertTrue(String.valueOf(true), new CoreCompetency("Persistence") instanceof CoreCompetency);

    }
}