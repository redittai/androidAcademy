package com.android_academy.ittai.androidacademy.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android_academy.ittai.androidacademy.R;

/**
 *
 *
 * Created by ittai on 23/11/2018.
 */

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView mBackgroundImage, mDetailsImage;
    TextView mTitleTV, mReleasedTV, mOverviewTV;
    Button mTrailerBTN;

    private static String KEY_POSITION = "position";
    private static String KEY_IMAGE = "image";
    private static String KEY_OVERVIEW = "overview";
    private static String KEY_TITLE = "title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initViews();
        if (savedInstanceState != null) {
            Toast.makeText(getApplicationContext(), "savedInstanceNot null", Toast.LENGTH_SHORT).show();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mTitleTV.setText(extras.getString(KEY_TITLE));
            mOverviewTV.setText(extras.getString(KEY_OVERVIEW));
            int image = extras.getInt(KEY_IMAGE);
            mDetailsImage.setImageResource(image);
            mBackgroundImage.setImageResource(image);
            Toast.makeText(getApplicationContext(), "Intent Extra Not null", Toast.LENGTH_SHORT).show();
        }
    }

    private void initViews()
    {
        mBackgroundImage = findViewById(R.id.background_image_view);
        mDetailsImage = findViewById(R.id.details_image_view);
        mTitleTV = findViewById(R.id.titleTV);
        mReleasedTV = findViewById(R.id.releasedTV);
        mOverviewTV = findViewById(R.id.overview);
        mTrailerBTN = findViewById(R.id.trailerButton);

        mTrailerBTN.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "move to trailer", Toast.LENGTH_SHORT).show();
    }
}
