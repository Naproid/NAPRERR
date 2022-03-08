package com.example.n01202455.cardview.Orientations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.example.n01202455.cardview.R;

public class property extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);

        CardView passageCardView = findViewById(R.id.passage_id);
        CardView searchCardView = findViewById(R.id.search_id);
        CardView technicalCardView = findViewById(R.id.technical_id);
        CardView planCardView = findViewById(R.id.plan_id);
        CardView documentCardView = findViewById(R.id.document_id);
        CardView archiveCardView = findViewById(R.id.archive_id);
        CardView debtorCardView = findViewById(R.id.debtor_id);
        CardView blockchainCardView = findViewById(R.id.blockchain_id);

        passageCardView.setOnClickListener(this);
        searchCardView.setOnClickListener(this);
        technicalCardView.setOnClickListener(this);
        planCardView.setOnClickListener(this);
        documentCardView.setOnClickListener(this);
        archiveCardView.setOnClickListener(this);
        debtorCardView.setOnClickListener(this);
        blockchainCardView.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.passage_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.passage_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.search_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.search_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.technical_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.technical_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.plan_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.plan_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.document_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.document_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.archive_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.archive_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.debtor_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.debtor_second_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.blockchain_id: {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.blockchain_second_web)));
                startActivity(browserIntent);
                break;
            }


        }
    }
}