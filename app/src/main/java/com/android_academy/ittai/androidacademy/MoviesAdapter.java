package com.android_academy.ittai.androidacademy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_academy.ittai.androidacademy.Models.MovieModel;

import java.util.List;

/**
 *
 *
 * Created by ittai on 24/11/2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private List<MovieModel> movies;
    private onMovieClickListener  listener;

    public MoviesAdapter(List<MovieModel> movies, onMovieClickListener listener) {
        this.movies = movies;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MoviesViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {

        holder.movieTitle.setText(movies.get(position).getMovieName());
        holder.movieOverview.setText(movies.get(position).getMovieOverview());
        holder.movieImage.setImageResource(movies.get(position).getImageResource());



    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView movieTitle;
        TextView movieOverview;
        ImageView movieImage;

        MoviesViewHolder(View itemView) {
            super(itemView);

            movieImage = itemView.findViewById(R.id.movieImageView);
            movieOverview = itemView.findViewById(R.id.movieOverviewTV);
            movieTitle = itemView.findViewById(R.id.movieTitleTV);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (listener == null) return;
            listener.onMovieClicked(getAdapterPosition());
        }
    }
}
