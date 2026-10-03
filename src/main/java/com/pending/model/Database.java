package com.pending.model;

import java.util.UUID;

public class Database {
    private DataList<User> users;
    private DataList<Admin> admins;
    private DataList<ReliefRequest> requests;
    private DataList<UUID> blacklist;
    private DataList<Hurricane> hurricanes;
    private DataList<Shelter> shelters;
    private DataList<Contact> contacts;
}
