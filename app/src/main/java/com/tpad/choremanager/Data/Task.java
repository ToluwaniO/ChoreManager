package com.tpad.choremanager.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by oguns on 11/2/2017.
 */

public class Task {
    private Person assignedBy, assignedTo;
    private Date date;
    private double duration;
    private ArrayList<String> equipments;
    private String notes, key;

    public Task() {
    }

    public Task(Person assignedBy, Person assignedTo, Date date, double duration, ArrayList<String> equipments, String notes) {
        this.assignedBy = assignedBy;
        this.assignedTo = assignedTo;
        this.date = date;
        this.duration = duration;
        this.equipments = equipments;
        this.notes = notes;
    }

    public Person getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(Person assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Person getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Person assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public ArrayList<String> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<String> equipments) {
        this.equipments = equipments;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
