package com.example.n01202455.cardview.SearchState;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.n01202455.cardview.R;

public class startingCalendar extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_calendar);


        DatePicker startingDate_cal = findViewById(R.id.startingDate_calendar);
        Button calendarButton = findViewById(R.id.calendar_button);

        startingDate_cal.setMaxDate(System.currentTimeMillis());

        calendarButton.setOnClickListener(v -> {

            String startResult = startingDate_cal.getDayOfMonth() + "/"
                    + (startingDate_cal.getMonth() + 1) + "/" + startingDate_cal.getYear();

            Intent startIntent = new Intent();
            startIntent.putExtra("startResult", startResult);
            setResult(RESULT_OK, startIntent);
            finish();
        });




    }
}