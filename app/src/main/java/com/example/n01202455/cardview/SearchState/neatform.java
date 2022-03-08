package com.example.n01202455.cardview.SearchState;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.n01202455.cardview.MainActivity;
import com.example.n01202455.cardview.Orientations.business;
import com.example.n01202455.cardview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class neatform extends AppCompatActivity {

    CardView startDate;
    CardView endDate;

    TextView starting;
    TextView ending;

    RecyclerView recyclerView;
    List<Statement> statements;
    public static final String JSON_URL = "https://mobileapi.napr.gov.ge/mobileapi/web/index.php/";
    Adapter adapter;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neatform);


        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.second);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.second:
                        return true;
                    case R.id.third:
                        startActivity(new Intent(getApplicationContext(), business.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });




        startDate = findViewById(R.id.startDate_id);
        endDate = findViewById(R.id.endDate_id);

        starting = findViewById(R.id.calendarStarting);
        ending = findViewById(R.id.calendarEnding);

        recyclerView = findViewById(R.id.stateList);
        SearchView search = findViewById(R.id.search_id);


        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(), "მოიძებნა "+ statements.size() + " განცხადება", Toast.LENGTH_LONG).show();


                return false;
            }

            @Override
            public boolean onQueryTextChange(String stateNum) {
                String URL = JSON_URL + "apps/getapps?search_criteria=1&keyword=" + stateNum + "&format=json";
                statements = new ArrayList<>();
                stateRequest(URL);

                return false;
            }
        });


        startDate.setOnClickListener(view -> {
            Intent intent = new Intent(this, startingCalendar.class);
            startActivityForResult(intent, 1);
        });


        endDate.setOnClickListener(view -> {
            Intent intent = new Intent(this, endingCalendar.class);
            startActivityForResult(intent, 2);
        });


    }




    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String startResult = data.getStringExtra("startResult");
                starting.setText(startResult);
            }
        }

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                String endResult = data.getStringExtra("endResult");
                ending.setText(endResult);
            }
        }
    }


    public void stateRequest(String URL) {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, response -> {
            for (int i = 0; i < response.length(); i++) {
                try {
                    JSONObject statementObject = response.getJSONObject(i);

                    Statement statement = new Statement();
                    statement.setAPP_STATUS(statementObject.getString("APP_STATUS"));
                    statement.setREG_NUMBER(statementObject.getString("REG_NUMBER"));
                    statement.setAPP_REG_DATE(statementObject.getString("APP_REG_DATE"));
                    statement.setFULL_TRANSACT(statementObject.getString("FULL_TRANSACT"));
                    statements.add(statement);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            adapter = new Adapter(getApplicationContext(), statements);
            recyclerView.setAdapter(adapter);
        }, error -> Log.d("tag", "onErrorResponse: " + error.getMessage()));

        queue.add(jsonArrayRequest);


    }
}
