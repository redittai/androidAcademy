package com.android_academy.ittai.androidacademy.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android_academy.ittai.androidacademy.Adapters.MoviesViewPagerAdapter;
import com.android_academy.ittai.androidacademy.Fragments.MovieListFragment;
import com.android_academy.ittai.androidacademy.Models.DataModel;
import com.android_academy.ittai.androidacademy.Models.MovieModel;
import com.android_academy.ittai.androidacademy.MoviesAdapter;
import com.android_academy.ittai.androidacademy.R;

import java.util.List;

public class MoviesViewPagerActivity extends AppCompatActivity  {

    MoviesViewPagerAdapter mAdapter;
    private List<MovieModel> mMovies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_view_pager);
        int position = getIntent().getIntExtra(MovieListFragment.KEY_POSITION,0);

        ViewPager pager = findViewById(R.id.movies_view_pager);
        mMovies = DataModel.loadData();
        mAdapter = new MoviesViewPagerAdapter(getSupportFragmentManager(),mMovies);
        pager.setAdapter(mAdapter);
        pager.setCurrentItem(position);

    }


}
