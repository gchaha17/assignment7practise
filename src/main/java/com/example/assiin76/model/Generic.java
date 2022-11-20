package com.example.assiin76.model;

public class Generic {
    private String name;
    private String occupation;
    private String message;

    public Generic(String name, String occupation, String message) {
        this.name = name;
        this.occupation = occupation;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}