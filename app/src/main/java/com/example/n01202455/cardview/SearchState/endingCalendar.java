package com.example.n01202455.cardview.SearchState;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.n01202455.cardview.R;

public class endingCalendar extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending_calendar);

        DatePicker endingDate_cal = findViewById(R.id.endingDate_calendar);
        Button sec_calendarButton = findViewById(R.id.calendar_sec_button);

        endingDate_cal.setMaxDate(System.currentTimeMillis());

        sec_calendarButton.setOnClickListener(v -> {

            String endResult = endingDate_cal.getDayOfMonth() + "/"
                    + (endingDate_cal.getMonth() + 1) + "/" + endingDate_cal.getYear();

            Intent endIntent = new Intent(endingCalendar.this, neatform.class);
            endIntent.putExtra("endResult", endResult);
            setResult(RESULT_OK, endIntent);
            finish();
        });

    }

}