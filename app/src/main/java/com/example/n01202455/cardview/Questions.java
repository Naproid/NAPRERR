package com.example.n01202455.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        /*ListView list = findViewById(R.id.list);

        ArrayList<String> questions = new ArrayList<>();
        questions.add(getString(R.string.firstQuestion));
        questions.add(getString(R.string.secQuestion));
        questions.add(getString(R.string.thirdQuestion));
        questions.add(getString(R.string.fourthQuestion));
        questions.add(getString(R.string.fifthQuestion));
        questions.add(getString(R.string.sixthQuestion));
        questions.add(getString(R.string.seventhQuestion));
        questions.add(getString(R.string.eighthQuestion));

        ArrayAdapter<String> questionsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questions
        );

        list.setAdapter(questionsAdapter);

        list.setOnItemClickListener((parent, view, position, id) -> {
            if (position == 0) {
                Intent intent = new Intent(view.getContext(), Answers.class);
                startActivity(intent);
            }
            if (position == 1) {
                Intent intent = new Intent(view.getContext(), secAct.class);
                startActivity(intent);
            }
            if (position == 2) {
                Intent intent = new Intent(view.getContext(), thirdAct.class);
                startActivity(intent);
            }
            if (position == 3) {
                Intent intent = new Intent(view.getContext(), fourthAct.class);
                startActivity(intent);
            }
            if (position == 4) {
                Intent intent = new Intent(view.getContext(), fifthAct.class);
                startActivity(intent);
            }
            if (position == 5) {
                Intent intent = new Intent(view.getContext(), sixthAct.class);
                startActivity(intent);
            }
            if (position == 6) {
                Intent intent = new Intent(view.getContext(), seventhAct.class);
                startActivity(intent);
            }
            if (position == 7) {
                Intent intent = new Intent(view.getContext(), eighthAct.class);
                startActivity(intent);
            }

        });*/
    }
}