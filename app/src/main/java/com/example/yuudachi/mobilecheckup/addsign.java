package com.example.yuudachi.mobilecheckup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yuudachi on 9/5/2014.
 */
public class addsign extends Fragment{
    public addsign() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_activity8, container, false);
        rootView.setVisibility(rootView.INVISIBLE);
        return rootView;
    }
}
