package com.example.rezanurrochmat.dateformatpeople;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Date oneWayTripDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String date ="2017-05-05";
        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat output = new SimpleDateFormat("MMMM dd,yyyy");
        try {
            oneWayTripDate = input.parse(date);  // parse input
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Log.e("===============","======currentData======"+output.format(oneWayTripDate));

    }


}
