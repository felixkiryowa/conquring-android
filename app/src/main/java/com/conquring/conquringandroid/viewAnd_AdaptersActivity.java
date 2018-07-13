package com.conquring.conquringandroid;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class viewAnd_AdaptersActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_and__adapters);

        ArrayAdapter<String> aAdpt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
        new String[]{"Froyo", "Gingerbread", "Honeycomb", "Ice cream Sandwich", "JellyBean",
                "KitKat"});

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(aAdpt);

        //handling event lisetners
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> aView, View view, int position,long id) {
                // We handle item click event
                TextView tv = (TextView) view;
                String text = (String) tv.getText();
                Toast.makeText(viewAnd_AdaptersActivity.this, "You clicked on " + text, Toast.LENGTH_LONG).show();
            }
        });



    }
}
