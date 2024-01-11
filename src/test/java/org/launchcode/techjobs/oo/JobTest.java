package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

        assertNotEquals(testJob1.getId(),testJob2.getId(),.01);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getName() instanceof String);
        assertEquals(testJob.getName(), "Product tester");

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(testJob.getEmployer().getValue(), "ACME");

        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().getValue(), "Desert");

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control");

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob1.getId(),testJob2.getId(),.01);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        String testJobAsString = testJob.toString();
//        String[] testJobAsStringArrayified = testJobAsString.split("");
//        String firstCharacter = testJobAsStringArrayified[0];
//        String lastCharacter = testJobAsStringArrayified[testJobAsStringArrayified.length - 1];
//
//        assertEquals(firstCharacter, lineSeparator());
//        assertEquals(lastCharacter, lineSeparator());

        String newline = System.lineSeparator();

        String firstCharacter = String.valueOf(testJob.toString().charAt(0));
        String lastCharacter = String.valueOf(testJob.toString().charAt(testJob.toString().length()-1));

        assertEquals(firstCharacter, System.lineSeparator());
        assertEquals(lastCharacter, System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newline = System.lineSeparator();
        String testJobAsStringRemovedNewlines = testJob.toString().trim();
        String testString = "ID: 4" + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Desert" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence";

        assertEquals(testJobAsStringRemovedNewlines, testString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String newline = System.lineSeparator();
        String testJobAsStringRemovedNewlines = testJob.toString().trim();
        String testString = "ID: 3" + newline +
                "Name: Data not available" + newline +
                "Employer: Data not available" + newline +
                "Location: Data not available" + newline +
                "Position Type: Data not available" + newline +
                "Core Competency: Data not available";

        assertEquals(testJobAsStringRemovedNewlines, testString);
    }

}
