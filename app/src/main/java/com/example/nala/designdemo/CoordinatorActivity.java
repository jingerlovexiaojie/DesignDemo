package com.example.nala.designdemo;

import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoordinatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
       findViewById(R.id.coordinator_btn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Snackbar.make(view,"Snackbar in CoordinatorLayout" ,Snackbar.LENGTH_LONG)
                       .setAction("exit", new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                             //退出整个应用
                               ActivityCompat.finishAffinity(CoordinatorActivity.this);
                           }
                       }).show();
           }
       });
    }
}
