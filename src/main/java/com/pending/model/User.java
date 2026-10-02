package com.pending.model;

import java.util.ArrayList;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
    private Location location;
    private Contact userContact;
    private Contact emergencyContact;
    private ArrayList<ReliefRequest> userReliefRequests;

    public User(UUID id, String firstName, String lastName,
        String password, Location location, Contact userContact,
        Contact emergencyContact) {

    }

    public User(String firstName, String lastName, String password,
        Location location, Contact userContact, Contact emergencyContact) {

    }

    public void requestRelief(Priority priority, String description,
        Location location, ArrayList<Resource> neededResources) {

    }

    public void viewReliefRequest(ReliefRequest reliefRequest) {

    }

    public void viewHurricaneStatus() {

    }
    public void cancelReliefRequest(ReliefRequest reliefRequest) {

    }
    public void acknowledgeAlert() {

    }

}