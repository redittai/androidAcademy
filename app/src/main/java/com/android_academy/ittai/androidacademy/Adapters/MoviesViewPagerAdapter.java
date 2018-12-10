package com.android_academy.ittai.androidacademy.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android_academy.ittai.androidacademy.Fragments.MovieListFragment;
import com.android_academy.ittai.androidacademy.Fragments.MoviesDetailsFragment;
import com.android_academy.ittai.androidacademy.Models.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * adapter to be implemented in view pager
 * Created by ittai on 03/12/2018.
 */

public class MoviesViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<MovieModel> mMovies = new ArrayList<>();

    public MoviesViewPagerAdapter(FragmentManager fm, List<MovieModel> mMovies) {
        super(fm);
        this.mMovies = mMovies;
    }

    @Override
    public Fragment getItem(int position) {
        MovieModel movie = mMovies.get(position);
        if (movie != null)
            return new MoviesDetailsFragment().newInstance(position, movie);//movie.getMovieName(),movie.getImageResource(),movie.getMovieOverview());
        return null;
    }

    @Override
    public int getCount() {
        return mMovies.size();
    }
}
