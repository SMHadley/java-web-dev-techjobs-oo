package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job jobOne, jobTwo, jobThree;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    @Before
    public void JobTest() {
        jobOne = new Job("Baker");
        jobTwo = new Job("Cook");
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, jobTwo.getId() - jobOne.getId());
        assertTrue(String.valueOf(true), jobTwo.getId() > jobOne.getId());
        assertFalse(String.valueOf(false), jobOne.getId() == jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
    assert

    }
}