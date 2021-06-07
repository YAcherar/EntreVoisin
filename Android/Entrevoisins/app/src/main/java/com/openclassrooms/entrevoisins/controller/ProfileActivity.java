package com.openclassrooms.entrevoisins.controller;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

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

    private static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");
        d(TAG, neighbour.getName());
        d(TAG, neighbour.getAboutMe());



        // Wire widgets
        mnameview = (TextView) findViewById(R.id.avatar_nameview);
        mAvatarImageView = (ImageView) findViewById(R.id.avatar_ImageView);
        mNameTextView = (TextView) findViewById(R.id.name_TextView);
        mAddressTextView = (TextView) findViewById(R.id.address_TextView);
        mNumberTextView = (TextView) findViewById(R.id.phoneNumber_TextView);
        mLinkTextView = (TextView) findViewById(R.id.link_TextView);
        mAboutMeTextView = (TextView) findViewById(R.id.aboutMe_TextView);

        mnameview.setText(neighbour.getName());
        mNameTextView.setText(neighbour.getName());
        mAddressTextView.setText(neighbour.getAddress());
        mNumberTextView.setText(neighbour.getPhoneNumber());
        mAboutMeTextView.setText(neighbour.getAboutMe());


    }

}