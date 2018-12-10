package com.android_academy.ittai.androidacademy.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model for Movie item
 * Created by ittai on 23/11/2018.
 */

public class MovieModel implements Parcelable
{
 private String movieName;
 private String movieOverview;
 private int imageResource;

    protected MovieModel(Parcel in) {
        movieName = in.readString();
        movieOverview = in.readString();
        imageResource = in.readInt();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public MovieModel() {

    }

    public String getMovieName() {
        return movieName;
    }

    void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieOverview() {
        return movieOverview;
    }

    void setMovieOverview(String movieOverview) {
        this.movieOverview = movieOverview;
    }

    public int getImageResource() {
        return imageResource;
    }

    void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieName);
        dest.writeString(movieOverview);
        dest.writeInt(imageResource);
    }
}
