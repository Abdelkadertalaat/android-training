package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Person_Data_Adpter extends RecyclerView.Adapter<Person_Data_Adpter.viewHolder> {

    List<Person> personList;
    public Person_Data_Adpter(List<Person> personList) { this.personList = personList;

    }
    @NonNull
    @Override
    public Person_Data_Adpter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rowshape,parent,false);
        return new viewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull Person_Data_Adpter.viewHolder holder, int position) {

        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView NameInArr  ;
        TextView IDInArr    ;
        TextView GradeInArr ;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            NameInArr = itemView.findViewById(R.id.Name_In_Arr);
            IDInArr   = itemView.findViewById(R.id.ID_In_Arr);
            GradeInArr= itemView.findViewById(R.id.Grade_In_Arr);
        }
        private void onBind(int position)
        {
            NameInArr.setText(personList.get(position).getName()+"");
            IDInArr.setText(personList.get(position).getID()+"");
            GradeInArr.setText(personList.get(position).getGrade()+"");
        }
    }
}
