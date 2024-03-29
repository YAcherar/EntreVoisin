package com.openclassrooms.entrevoisins.controller;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

import static android.util.Log.*;

public class ProfileActivity extends AppCompatActivity {

    private TextView mnameview;
    private ImageView mAvatarImageView;
    private TextView mNameTextView;
    private TextView mAddressTextView;
    private TextView mNumberTextView;
    private TextView mLinkTextView;
    private TextView mAboutMeTextView;
    private FloatingActionButton mstar;

    private static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");
        d(TAG, neighbour.getName());
        d(TAG, neighbour.getAboutMe());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        // Wire widgets
        mnameview = (TextView) findViewById(R.id.avatar_nameview);
        mAvatarImageView = (ImageView) findViewById(R.id.avatar_ImageView);
        mNameTextView = (TextView) findViewById(R.id.name_TextView);
        mAddressTextView = (TextView) findViewById(R.id.address_TextView);
        mNumberTextView = (TextView) findViewById(R.id.phoneNumber_TextView);
        mLinkTextView = (TextView) findViewById(R.id.link_TextView);
        mAboutMeTextView = (TextView) findViewById(R.id.aboutMe_TextView);
        mstar = (FloatingActionButton) findViewById(R.id.star);

        mnameview.setText(neighbour.getName());
        mNameTextView.setText(neighbour.getName());
        Glide.with(this)
                .load(neighbour.getAvatarUrl())
                .into(mAvatarImageView);
        mAddressTextView.setText(neighbour.getAddress());
        mNumberTextView.setText(neighbour.getPhoneNumber());
        mAboutMeTextView.setText(neighbour.getAboutMe());

        mstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mstar.setImageResource(R.drawable.ic_star_yellow_24dp);
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home : {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}