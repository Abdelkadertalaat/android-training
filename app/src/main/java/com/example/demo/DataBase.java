package com.example.demo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Person.class,version = 1,exportSchema = false)
public abstract class DataBase extends RoomDatabase {

    private static DataBase instance;
    public abstract PersonDao personDao();

    public static  DataBase getInstance(Context context) {

        if(instance==null)
        {
          instance=Room.databaseBuilder(context.getApplicationContext(),DataBase.class,"DataBase")
                  .allowMainThreadQueries()
                  .build();
        }
    return instance;
    }

}
