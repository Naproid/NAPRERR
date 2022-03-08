package com.example.n01202455.cardview.Orientations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.example.n01202455.cardview.R;

public class limit extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limit);


        CardView sequesterCardView = findViewById(R.id.sequester_id);
        CardView searchCardView = findViewById(R.id.search_id);
        CardView noticeCardView = findViewById(R.id.notice_id);
        CardView debtorCardView = findViewById(R.id.debtor_id);
        CardView preparationCardView = findViewById(R.id.preparation_id);
        CardView pub_limCardView = findViewById(R.id.pub_lim_id);

        sequesterCardView.setOnClickListener(this);
        searchCardView.setOnClickListener(this);
        noticeCardView.setOnClickListener(this);
        debtorCardView.setOnClickListener(this);
        preparationCardView.setOnClickListener(this);
        pub_limCardView.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {






        switch (view.getId()) {

            case R.id.sequester_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.sequester_fifth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.search_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.search_fifth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.notice_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.notice_fifth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.debtor_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.debtor_fifth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.preparation_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.preparation_fifth_web)));
                startActivity(browserIntent);
                break;
            }

            case R.id.pub_lim_id: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.pub_lim_fifth_web)));
                startActivity(browserIntent);
                break;
            }

        }
    }
}