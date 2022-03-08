package com.example.n01202455.cardview.Orientations;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.example.n01202455.cardview.R;

public class contact extends AppCompatActivity implements View.OnClickListener {

    private static final int REQUEST_CALL = 1;
    String hotlinePhoneNum = "08 009 009 09";
    String soc_relPhoneNum = "2 91 18 68 ";
    String vacancyPhoneNum = "2 91 18 68";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        CardView hotlineCardView = findViewById(R.id.hotline_id);
        CardView soc_relCardView = findViewById(R.id.soc_rel_id);
        CardView vacancyPhoneCardView = findViewById(R.id.vacancy_phone_id);


        hotlineCardView.setOnClickListener(this);
        soc_relCardView.setOnClickListener(this);
        vacancyPhoneCardView.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.hotline_id:
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + hotlinePhoneNum;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            break;

            case R.id.soc_rel_id: {

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + soc_relPhoneNum;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            }
            break;

            case R.id.vacancy_phone_id: {

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + vacancyPhoneNum;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            }
            break;

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + hotlinePhoneNum;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        } else {
            Toast.makeText(this, "Permission DENIED", Toast.LENGTH_LONG).show();
        }
    }
}