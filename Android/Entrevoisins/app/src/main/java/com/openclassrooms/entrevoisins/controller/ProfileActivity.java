package com.openclassrooms.entrevoisins.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;

public class ProfileActivity extends AppCompatActivity {

    private ImageView mAvatarImageView;
    private TextView mNameTextView;
    private TextView mAddressTextView;
    private TextView mNumberTextView;
    private TextView mLinkTextView;
    private TextView mAboutMeTextView1;
    private TextView mAboutMeTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Wire widgets
        mAvatarImageView = (ImageView) findViewById(R.id.avatar_ImageView);
        mNameTextView = (TextView) findViewById(R.id.name_TextView);
        mAddressTextView = (TextView) findViewById(R.id.address_TextView);
        mNumberTextView = (TextView) findViewById(R.id.phoneNumber_TextView);
        mLinkTextView = (TextView) findViewById(R.id.link_TextView);
        mAboutMeTextView1 = (TextView) findViewById(R.id.aboutMe_TextView1);
        mAboutMeTextView2 = (TextView) findViewById(R.id.aboutMe_TextView2);
    }
}