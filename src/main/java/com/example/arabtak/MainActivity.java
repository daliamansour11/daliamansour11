package com.example.arabtak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     recyclerView = findViewById(R.id.rv_main);

        ArrayList<String>cars=new ArrayList<>();
        cars.add("brand");
        cars.add("image");
        cars.add("construction year");
        cars.add("status");
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(this,4);



    }
}