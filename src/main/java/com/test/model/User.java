package com.test.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    String firstname;
    String lastname;
    String middlename;
    int age;

    public User(String firstname, String lastname, String middlename,int age) {
        this.firstname = firstname;
        this.lastname  = lastname;
        this.middlename= middlename;
        this.age = age;
    }

    public String getUser(){
        return this.firstname + "," + this.lastname;
    }
}
