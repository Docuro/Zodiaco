package com.example.gboo_.zodiaco;

/**
 * Created by Gboo_ on 06-11-2017.
 */

public class Persona {

    private String name;
    private String password;

    public Persona() {
    }

    public Persona(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
