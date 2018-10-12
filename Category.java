package com.pro.we.weamproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Category extends AppCompatActivity {
    ListView cate1;
    ArrayList cate = new ArrayList();
    ArrayAdapter cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        cate1 = (ListView)findViewById(R.id.cate1);
        cate.add("memes");
        cate.add("sport");
        cate.add("nature");
        cate.add("school");
        cat = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , cate);
        cate1.setAdapter(cat);

    }
}
