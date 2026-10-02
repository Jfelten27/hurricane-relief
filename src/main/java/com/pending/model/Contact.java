package com.pending.model;

import java.util.UUID;

public class Contact {

    private UUID id;
    private String email;
    private String phone;
    private ContactPreference contactPreference;

    public Contact(UUID id, String email, String phoneNumber,
        ContactPreference contactPreference) {

    }

    public Contact(String email, String phoneNumber,
        ContactPreference contactPreference) {

    }

    public boolean contactEmail() {
        return false;
    }

    public boolean contactPhoneCall() {
        return false;
    }

    public boolean contactPhoneText() {
        return false;
    }
}