package com.example.messengerfb;

public class User {
    private String id;
    private String name;
    private String lastName;
    private int age;
    private boolean online;

    public User(String id, String name, String lastName, int age, boolean isOnLine) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.online = isOnLine;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isOnline() {
        return online;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isOnline=" + online +
                '}';
    }
}
