package com.example.n07;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class details extends Fragment {

    private static TextView tvName;
    private static TextView tvPhone;
    private  ImageView ivContact;

    public details() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        tvName = view.findViewById(R.id.tName);
        tvPhone = view.findViewById(R.id.tPhone);
        ivContact = view.findViewById(R.id.contact);
        ivContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PhoneNum = tvPhone.getText().toString().trim();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("phone" + PhoneNum));
                startActivity(intent);
            }
        });
        return view;

    }
    public static void updateText(String st1, String st2){
        tvName.setText(st1);
        tvPhone.setText(st2);
    }
}
