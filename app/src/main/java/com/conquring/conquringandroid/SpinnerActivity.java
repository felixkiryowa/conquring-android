package com.conquring.conquringandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        ArrayAdapter<CharSequence> aAdpt = ArrayAdapter.createFromResource(this, R.array.days,
                android.R.layout.simple_spinner_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(aAdpt);



    }
}
