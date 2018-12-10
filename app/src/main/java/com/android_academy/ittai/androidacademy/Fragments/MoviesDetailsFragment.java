package com.android_academy.ittai.androidacademy.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android_academy.ittai.androidacademy.Models.MovieModel;
import com.android_academy.ittai.androidacademy.R;

/**

 * create an instance of this fragment.
 */
public class MoviesDetailsFragment extends Fragment implements View.OnClickListener{

    private static final String KEY_MODEL = "model";
    ImageView mBackgroundImage, mDetailsImage;
    TextView mTitleTV, mReleasedTV, mOverviewTV;
    Button mTrailerBTN;
    MovieModel mModel;

    private static String KEY_POSITION = "position";
    private static String KEY_IMAGE = "image";
    private static String KEY_OVERVIEW = "overview";
    private static String KEY_TITLE = "title";
    
    public MoviesDetailsFragment() {
        // Required empty public constructor
    }
    public MoviesDetailsFragment newInstance(int position, String name, int resourceId, String overview)
    {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_POSITION,position);
        bundle.putString(KEY_OVERVIEW,overview);
        bundle.putString(KEY_TITLE,name);
        bundle.putInt(KEY_IMAGE,resourceId);


        MoviesDetailsFragment movieDetailesFragment = new MoviesDetailsFragment();
        movieDetailesFragment.setArguments(bundle);
        return movieDetailesFragment;
    }

    public MoviesDetailsFragment newInstance(int position, MovieModel model)
    {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_POSITION,position);
        bundle.putParcelable(KEY_MODEL,model);

        MoviesDetailsFragment movieDetailesFragment = new MoviesDetailsFragment();
        movieDetailesFragment.setArguments(bundle);
        return movieDetailesFragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt(KEY_POSITION);
            mModel = arguments.getParcelable(KEY_MODEL);

            if (mModel == null) return;
                mTitleTV.setText(mModel.getMovieName());
                mOverviewTV.setText(mModel.getMovieOverview());
                mDetailsImage.setImageResource(mModel.getImageResource());
                mBackgroundImage.setImageResource(mModel.getImageResource());
        }
    }

    private void initViews(View view) {
        mBackgroundImage = view.findViewById(R.id.background_image_view);
        mDetailsImage = view.findViewById(R.id.details_image_view);
        mTitleTV = view.findViewById(R.id.titleTV);
        mReleasedTV = view.findViewById(R.id.releasedTV);
        mOverviewTV = view.findViewById(R.id.overview);
        mTrailerBTN = view.findViewById(R.id.trailerButton);

        mTrailerBTN.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "move to trailer", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
       
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
