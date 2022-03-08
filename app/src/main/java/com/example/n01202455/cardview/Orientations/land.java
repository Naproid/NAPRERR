package com.example.n01202455.cardview.Orientations;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.example.n01202455.cardview.R;

public class land extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        CardView searchLandCardView = findViewById(R.id.land_id);

        searchLandCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.search_first_web)));
        startActivity(browserIntent);

    }
}
