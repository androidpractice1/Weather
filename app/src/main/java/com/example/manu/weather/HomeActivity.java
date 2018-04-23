package com.example.manu.weather;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    MainFragment mMainFragment;
    RecyclerFragment mRecyclerFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mMainFragment = new MainFragment();
        mRecyclerFragment = new RecyclerFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container_main, mMainFragment);
        transaction.add(R.id.container_recycler, mRecyclerFragment);

        transaction.commit();
    }
}
