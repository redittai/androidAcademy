package com.android_academy.ittai.androidacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android_academy.ittai.androidacademy.Fragments.MovieListFragment;

public class MoviesActivity extends AppCompatActivity  {

    MovieListFragment movieListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        if (savedInstanceState == null)
            initFragment();
        else
           movieListFragment = (MovieListFragment) getSupportFragmentManager().findFragmentByTag("TAG");
    }

    private void initFragment() {
        movieListFragment = new MovieListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,movieListFragment,"TAG")
                .commit();
    }



}