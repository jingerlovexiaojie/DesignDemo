package com.example.nala.designdemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DesignActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ViewPager viewpager;
    private TabLayout tab;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_layout);
        viewpager = (ViewPager) findViewById(R.id.viewPager);
        tab = (TabLayout) findViewById(R.id.tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //用toolbar 代替actionbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, 0, 0);
        //设置监听
        drawer.addDrawerListener(toggle);
        //同步
        toggle.syncState();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(String.format(Locale.CHINA,"第%2d页",i));
        }
        viewpager.setAdapter(new TabAdapter(getSupportFragmentManager(),list));
        //TabLayout和ViewPager联动
        tab.setupWithViewPager(viewpager);

        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Snackbar",Snackbar.LENGTH_INDEFINITE)
                        .setAction("undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(DesignActivity.this, CoordinatorActivity.class));
                            }
                        }).show();
            }
        });

    }

    //点击事件
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_4:
                finish();
                break;
        }
        //点击任何的时候收
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
