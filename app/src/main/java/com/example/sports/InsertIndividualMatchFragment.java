package com.example.sports.ui.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sports.R;

public class InsertIndividualMatchFragment extends Fragment {
    public InsertIndividualMatchFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_insert_individual_match, container, false);
        return view;
    }
}
