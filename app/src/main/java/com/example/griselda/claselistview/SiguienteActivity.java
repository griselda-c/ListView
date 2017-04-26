package com.example.griselda.claselistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SiguienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);
        getSupportActionBar().setTitle("Siguiente Activity");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
