package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Database
        DataBase dataBase = DataBase.getInstance(this);

        Person_Data_Adpter adpter = new Person_Data_Adpter(dataBase.personDao().getPerson());

        recyclerView=findViewById(R.id.recycler_view);

        recyclerView.setAdapter(adpter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //holding main view
        Button AddBtn = findViewById(R.id.Add_To_DB);
        EditText Person_Name = findViewById(R.id.Person_Name);
        EditText Person_ID   = findViewById(R.id.Person_Id);
        EditText Person_Grade= findViewById(R.id.Person_grade);
        //reaction of btn
        AddBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

              Person person=new Person(Person_Grade.getText().toString(),Person_ID.getText().toString(),Person_Name.getText().toString());

               dataBase.personDao().insertData(person);
               adpter.personList.add(person);
               adpter.notifyDataSetChanged();

            }
        });
    }
}