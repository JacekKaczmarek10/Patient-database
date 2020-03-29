package com.timbuchalka.todolist.datamodel;

import javafx.scene.control.ChoiceBox;

import java.awt.*;
import java.time.LocalDate;

/**
 * Created by timbuchalka on 17/04/2016.
 */
public class TodoItem {

    private String patientName;
    private String visitType;
    private String details;
    private LocalDate deadline;
    private String hour;


    public TodoItem(String patientName, String visitType, String details, LocalDate deadline, String hour) {
        this.patientName = patientName;
        this.visitType = visitType;
        this.details = details;
        this.deadline = deadline;
        this.hour = hour;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
