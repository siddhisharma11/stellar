package com.hsbc.meetingroombookingsystem.domain;

public class Members extends User {
    public Members(int id, String name, String email, String phone, Role role) {
        super(id, name, email, phone,role);
    }
    
}
