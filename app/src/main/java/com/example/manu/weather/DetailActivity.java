package com.example.manu.weather;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    MainFragment mMainFragment;
    DetailFragment mDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mMainFragment = new MainFragment();
        mDetailFragment = new DetailFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container_main_detail, mMainFragment);
        transaction.add(R.id.detail_container, mDetailFragment);

        transaction.commit();
    }
}
