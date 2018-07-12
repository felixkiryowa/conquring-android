package com.conquring.conquringandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);


    }

    public void optionOneSelected(View view) {
        //Button btn = (Button) findViewById(R.id.Btn);
        Toast.makeText(this,"Option 1 Selected",Toast.LENGTH_SHORT).show();
    }

    public void ButtonClickHere(View view) {
        Toast.makeText(this,"click here",Toast.LENGTH_SHORT).show();
    }
}
