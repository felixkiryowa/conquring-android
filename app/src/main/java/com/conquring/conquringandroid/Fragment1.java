package com.conquring.conquringandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Fragment1 extends AppCompatActivity implements MyFragment.FragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
    }


    @Override
    public void onClickButton() {
        //Handle Here The Event
        Toast.makeText(getApplicationContext(),"Clicked A button in Fragment Layout",Toast.LENGTH_LONG).show();
    }
}
