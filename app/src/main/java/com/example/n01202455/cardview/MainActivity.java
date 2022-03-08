package com.example.n01202455.cardview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;

import com.example.n01202455.cardview.Orientations.business;
import com.example.n01202455.cardview.Orientations.contact;
import com.example.n01202455.cardview.Orientations.economical;
import com.example.n01202455.cardview.Orientations.limit;
import com.example.n01202455.cardview.Orientations.property;
import com.example.n01202455.cardview.SearchState.neatform;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.first);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first:
                        return true;
                    case R.id.second:
                        startActivity(new Intent(getApplicationContext(), neatform.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.third:
                        startActivity(new Intent(getApplicationContext(), business.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i0.wp.com/livesnapcreate.com/wp-content/uploads/2019/12/DSC_3265-2-1.jpg?resize=1024%2C681&ssl=1",
                "მიწის რეგისტრაციის რეფორმა"));
        slideModels.add(new SlideModel("https://www.teahub.io/photos/full/197-1979410_anime-landscape-forest-night-stars-wolf-night-snow.png",
                "უძრავი ქონების რეესტრი"));
        slideModels.add(new SlideModel("https://konachan.com/sample/bb97a48016a89226c533dff2641650ff/Konachan.com%20-%2095219%20sample.jpg",
                "ბიზნესის რეესტრი"));
        slideModels.add(new SlideModel("https://images.alphacoders.com/928/thumb-1920-928742.jpg","ეკონომიკურ საქმიანობათა რეესტრი"));
        imageSlider.setImageList(slideModels, true);


        CardView landCardView = findViewById(R.id.land_id);
        CardView propertyCardView = findViewById(R.id.property_id);
        CardView businessCardView = findViewById(R.id.business_id);
        CardView economicalCardView = findViewById(R.id.economical_id);
        CardView limitCardView = findViewById(R.id.limit_id);
        CardView contactCardView = findViewById(R.id.contact_id);

        landCardView.setOnClickListener(this);
        propertyCardView.setOnClickListener(this);
        businessCardView.setOnClickListener(this);
        economicalCardView.setOnClickListener(this);
        limitCardView.setOnClickListener(this);
        contactCardView.setOnClickListener(this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId())
        {
            case R.id.land_id: {
                intent = new Intent(this, neatform.class);
                startActivity(intent);
                break;
            }

            case R.id.property_id: {
                intent = new Intent(this, property.class);
                startActivity(intent);
                break;
            }

            case R.id.business_id: {
                intent = new Intent(this, business.class);
                startActivity(intent);
                break;
            }

            case R.id.economical_id: {
                intent = new Intent(this, economical.class);
                startActivity(intent);
                break;
            }

            case R.id.limit_id: {
                intent = new Intent(this, limit.class);
                startActivity(intent);
                break;
            }

            case R.id.contact_id: {
                intent = new Intent(this, contact.class);
                startActivity(intent);
                break;
            }
        }
    }


}
