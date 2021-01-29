package com.example.demo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void insertData(Person person);

    
    @Query("Select * from PersonInfo")
    List<Person> getPerson();


}
