package com.example.n07;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemSelected {

    public static ArrayList<Person> people;
    TextView tvDate;
    String CurrentDate;
    Calendar calender=Calendar.getInstance();
    FragmentManager fragmentManager;
    list list;
    details details;
    add add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvDate=findViewById(R.id.tvDate);
        fragmentManager=this.getSupportFragmentManager();

        CurrentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calender.getTime());
        tvDate.setText(CurrentDate);
        list=(list)fragmentManager.findFragmentById(R.id.f1);

        intArray();

        details=(details) fragmentManager.findFragmentById(R.id.f2);
        add=(add)fragmentManager.findFragmentById(R.id.f3);
    }

    public void intArray(){
        people=new ArrayList<Person>();
        people.add(new Person("Lian","0537597049",R.drawable.profile));
        people.add(new Person("Tasneem","0503518810",R.drawable.profile));
        people.add(new Person("Sara","0509945069",R.drawable.profile));
        people.add(new Person("Malak","0527868466",R.drawable.profile));
        people.add(new Person("Bayena","0523772407",R.drawable.profile));
    }


    @Override
    public void onItemSelected(int index) {
        if(!people.isEmpty()){
            details.updateText(people.get(index).getName(),people.get(index).getPhone());
        }
    }
}