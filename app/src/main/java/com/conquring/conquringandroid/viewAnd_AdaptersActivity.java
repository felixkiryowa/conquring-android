package com.conquring.conquringandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewAnd_AdaptersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_and__adapters);

        ArrayAdapter<String> aAdpt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
        new String[]{"Froyo", "Gingerbread", "Honeycomb", "Ice cream Sandwich", "JellyBean",
                "KitKat"});

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(aAdpt);

    }
}
