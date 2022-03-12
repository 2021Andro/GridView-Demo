package com.example.grideview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private GridView gv;

    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = findViewById(R.id.gv);

        GridAdapter adapter = new GridAdapter(this, imageList, nameList);

        gv.setAdapter(adapter);

        imageList.add(R.drawable.one);
        nameList.add("One");

        imageList.add(R.drawable.two);
        nameList.add("Two");

        imageList.add(R.drawable.three);
        nameList.add("Three");

        imageList.add(R.drawable.four);
        nameList.add("Four");

        imageList.add(R.drawable.five);
        nameList.add("Five");

        imageList.add(R.drawable.six);
        nameList.add("Six");

        imageList.add(R.drawable.seven);
        nameList.add("Seven");

        imageList.add(R.drawable.eight);
        nameList.add("Eight");

        imageList.add(R.drawable.nine);
        nameList.add("Nine");

        imageList.add(R.drawable.ten);
        nameList.add("Ten");

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Item select "+nameList.get(i), Toast.LENGTH_SHORT).show();
            }
        });



    }
}