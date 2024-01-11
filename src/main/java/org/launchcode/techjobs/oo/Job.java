package org.launchcode.techjobs.oo;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String nameCheck = name;
        String employerCheck = employer.getValue();
        String locationCheck = location.getValue();
        String positionTypeCheck = positionType.getValue();
        String coreCompetencyCheck = coreCompetency.getValue();

        if (name.isEmpty()) {
            nameCheck = "Data not available";
        }

        if (employerCheck.isEmpty()) {
            employerCheck = "Data not available";
        }

        if (locationCheck.isEmpty()) {
            locationCheck = "Data not available";
        }

        if (positionTypeCheck.isEmpty()) {
            positionTypeCheck = "Data not available";
        }

        if (coreCompetencyCheck.isEmpty()) {
            coreCompetencyCheck = "Data not available";
        }

        return newline +
                "ID: " + id + newline +
                "Name: " + nameCheck + newline +
                "Employer: " + employerCheck + newline +
                "Location: " + locationCheck + newline +
                "Position Type: " + positionTypeCheck + newline +
                "Core Competency: " + coreCompetencyCheck +
                newline;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
