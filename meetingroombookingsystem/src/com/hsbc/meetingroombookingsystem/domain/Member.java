package com.hsbc.meetingroombookingsystem.domain;

class Member extends User {
    public Member(String id, String name, String email, String phone, int credits, Role role) {
        super(id, name, email, phone, credits, role);
    }
    
}
