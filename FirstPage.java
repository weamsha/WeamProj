package com.pro.we.weamproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity implements View.OnClickListener {
Button button;
    Button cate, tracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        cate=(Button)findViewById(R.id.cate);
        cate.setOnClickListener(this);
       /* tracker=(Button)findViewById(R.id. tracker);
        tracker.setOnClickListener(this); */
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
//menu  פתיחת התפריט לפי המזהה שלו לתוך התפריט שהתקבל כפרמטר
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       if (id == R.id.action_login) {
            Toast.makeText(this, "you selected login", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_signup) {
            Toast.makeText(this, "you selected sign up", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Signup.class);
            startActivity(intent);
            return true;
        }

        return true;
    }


    @Override
    public void onClick(View v) {
        if (cate == v ){
            Intent intent=new Intent(this, Category.class);
            startActivity(intent);
        }
         /* if (tracker == v ){
            Intent gototracker=new Intent(this,Tracker.class);
            startActivity(gototracker);
        } */
    }
}
