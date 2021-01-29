package com.example.demo;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PersonInfo")
public class Person {

    String  Grade;
    @PrimaryKey
    @NonNull
    String ID;
    String Name;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Person(String grade, String ID, String name) {
        Grade = grade;
        this.ID = ID;
        Name = name;
    }
    public Person(){}
}
