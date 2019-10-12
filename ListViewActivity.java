package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView ListView;
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView = findViewById(R.id.listView);

        names.add("John");
        names.add("Joe");
        names.add("Avicli");
        names.add("Rich Chiggs");
        names.add("Kai");
        names.add("Monkey King");
        names.add("Shou Yue");
        names.add("Xuan Ce");
        names.add("Angela");
        names.add("Diao Chan");
        names.add("Da Qiao");
        names.add("Sun Shang Xiang");
        names.add("Li Bai");
        names.add("Han Xin");
        names.add("King Glory");

        ArrayAdapter<String> nameAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        ListView.setAdapter(nameAdapter);
    }
}
