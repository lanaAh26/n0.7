package com.example.n07;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class list extends Fragment {

    public static RecyclerView recyclerView;
    public static RecyclerView.Adapter adapter;
    public static RecyclerView.LayoutManager maneger;


    public list() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);
        recyclerView=view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        maneger=new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(maneger);

        adapter=new PersonAdapter(this.getActivity(),MainActivity.people);
        recyclerView.setAdapter(adapter);
        return view;    }

    public static void notifyDataSetChanged(){
        adapter.notifyDataSetChanged();
    }
}