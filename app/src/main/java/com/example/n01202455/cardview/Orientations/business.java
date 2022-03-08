package com.example.n01202455.cardview.Orientations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.view.MenuItem;
import android.view.View;

import com.example.n01202455.cardview.MainActivity;
import com.example.n01202455.cardview.R;
import com.example.n01202455.cardview.SearchState.neatform;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class business extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.third);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.second:
                        startActivity(new Intent(getApplicationContext(), neatform.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.third:
                        return true;
                }
                return false;
            }
        });



        CardView passageCardView = findViewById(R.id.passage_id);
        CardView searchCardView = findViewById(R.id.search_id);
        CardView technicalCardView = findViewById(R.id.technical_id);
        CardView documentCardView = findViewById(R.id.document_id);
        CardView debtorCardView = findViewById(R.id.debtor_id);
        CardView archiveCardView = findViewById(R.id.archive_id);


        passageCardView.setOnClickListener(this);
        searchCardView.setOnClickListener(this);
        technicalCardView.setOnClickListener(this);
        documentCardView.setOnClickListener(this);
        debtorCardView.setOnClickListener(this);
        archiveCardView.setOnClickListener(this);

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.passage_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.passage_third_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.search_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.search_third_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.technical_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.technical_third_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.plan_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.document_third_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.document_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.debtor_third_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.archive_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.archive_third_web)));
                startActivity(browserIntent);
                break;
            }


        }
    }
}