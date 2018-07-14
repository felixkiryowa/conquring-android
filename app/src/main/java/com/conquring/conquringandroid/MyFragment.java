package com.conquring.conquringandroid;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragment extends Fragment {

    //communication between an activity and a fragment
    public static interface FragmentListener {
        public void onClickButton() ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.text_frag, container, false);
        //getting button click event
        Button b = (Button) v.findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentListener) getActivity()).onClickButton();
            }
        });

        return v;
    }
    //Now we have to check, in the fragment class, if the activity implements the interface so that we can notify the event, when it
    //occurs. The best place to do it, remembering the fragment lifecycle, is in the onAttach method, so we have:
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof FragmentListener))
            throw new ClassCastException();
    }
}
