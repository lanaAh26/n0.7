package com.example.n07;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class add extends Fragment {

    EditText etName,etPhone;
    Button btn;



    public add() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_add, container, false);
        etName=view.findViewById(R.id.eT1);
        etPhone=view.findViewById(R.id.eT2);
        btn=view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText().toString().trim().isEmpty() || etPhone.getText().toString().trim().isEmpty())
                    Toast.makeText(getActivity(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                else {
                    String name,phone;
                    name=etName.getText().toString().trim();
                    phone=etPhone.getText().toString().trim();
                    MainActivity.people.add(new Person(name,phone,R.drawable.profile));
                    Toast.makeText(getActivity(), "Contact added successfully", Toast.LENGTH_SHORT).show();
                    etName.setText("");
                    etPhone.setText("");
                    list.notifyDataSetChanged();
                }
            }
        });
        return view;
    }
}