package com.example.cpaine.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"Pushing Daisies","Better Off Ted","Twin Peaks","Freak and Geeks",
                "Orphan Black","Walking Dead","Breaking Bad","The 400","Alphas","Life on Mars"};
    }
}
