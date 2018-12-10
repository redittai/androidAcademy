package com.android_academy.ittai.androidacademy.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android_academy.ittai.androidacademy.Activities.DetailsActivity;
import com.android_academy.ittai.androidacademy.Activities.MoviesViewPagerActivity;
import com.android_academy.ittai.androidacademy.Models.DataModel;
import com.android_academy.ittai.androidacademy.Models.MovieModel;
import com.android_academy.ittai.androidacademy.MoviesAdapter;
import com.android_academy.ittai.androidacademy.R;
import com.android_academy.ittai.androidacademy.onMovieClickListener;

import java.util.List;

/**
 * movie list fragment
 * Created by Ittai on 26/11/2018.
 */

public class MovieListFragment extends Fragment implements onMovieClickListener {

    public static String KEY_POSITION = "position";
    private static String KEY_IMAGE = "image";
    private static String KEY_OVERVIEW = "overview";
    private static String KEY_MOVIE_MODEL = "movie model";
    private static String KEY_TITLE = "title";
    RecyclerView mRecyclerView;
    LinearLayoutManager mLinearLayoutManager;
    MoviesAdapter mAdapter;
    List<MovieModel> mMovies;

    public MovieListFragment() {
    }

    public static MovieListFragment newInstance(String movie, int position)
    {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_POSITION,position);
        bundle.putString(KEY_TITLE,movie);
        MovieListFragment movieListFragment = new MovieListFragment();
        movieListFragment.setArguments(bundle);
        return movieListFragment;
    }

    private void showView()
    {
        mRecyclerView.setAdapter(mAdapter);
        mLinearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMovies = DataModel.loadData();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test,container,false);
    }

    @Override
    public void onMovieClicked(int itemPosition) {

        MovieModel movieModel = mMovies.get(itemPosition);
        Toast.makeText(getContext(), movieModel.getMovieName() + " Clicked", Toast.LENGTH_SHORT).show();

        Intent details = new Intent(getContext(), MoviesViewPagerActivity.class);
        Bundle b = new Bundle();
        details.putExtra(KEY_POSITION, itemPosition);
        details.putExtra(KEY_MOVIE_MODEL,movieModel);
        startActivity(details,b);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.moviesRV);
        mAdapter = new MoviesAdapter(mMovies,this);
        showView();
    }

}
