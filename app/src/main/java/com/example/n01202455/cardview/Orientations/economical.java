package com.example.n01202455.cardview.Orientations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.example.n01202455.cardview.R;

public class economical extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economical);

        CardView searchCardView = findViewById(R.id.search_id);
        CardView registrationCardView = findViewById(R.id.registration_id);
        CardView nationalCardView = findViewById(R.id.national_id);


        searchCardView.setOnClickListener(this);
        registrationCardView.setOnClickListener(this);
        nationalCardView.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.search_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.search_fourth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.registration_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.registration_fourth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.national_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.national_fourth_web)));
                startActivity(browserIntent);
                break;
            }

        }

    }
}