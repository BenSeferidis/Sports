package com.example.sports.ui.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sports.Athlete;
import com.example.sports.MainActivity;
import com.example.sports.R;
import com.example.sports.Sport;
import com.example.sports.Team;

import java.util.List;

public class QueryFragment extends Fragment {

    TextView querytextView;
    Button bnqueryrun;

    public QueryFragment() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_query, container, false);

        querytextView = view.findViewById(R.id.txtquery);
        List<Sport> sports = MainActivity.myAppDatabase.myDao().getSport();
        String result = "";
        for (Sport i : sports) {
            int code = i.getId();
            String name = i.getSport_name();
            String gender = i.getGender();
            String kind_sport = i.getKind_sport();
            result = result + "\n Id: " + code + "\n Name: " + name + "\n gender: " + gender + "\n kind: " + kind_sport + "\n";
        }


        List<Athlete> athletes = MainActivity.myAppDatabase.myDao().getAthlete();
        String result2 = "";
        for (Athlete i : athletes) {
            int code01 = i.getAid();
            String name = i.getName();
            String last_name = i.getLname();
            String city = i.getCity();
            String country=i.getCountry();
            int code1=i.getAisid();
            int year=i.getYear();
            result2 = result2 + "\n Athlete Id: " + code01 + "\n Name: " + name + "\n Last name: " + last_name + "\n City: " + city + "\n Country: " + country + "\n sport id: " + code1 + "\n Year: " + year + "\n";
        }


        List<Team> teams = MainActivity.myAppDatabase.myDao().getTeam();
        String result3 = "";
        for (Team i : teams) {
            int code01 = i.getId();
            String name = i.getTeam_name();
            String stadium = i.getStadium_name();
            String city = i.getCity_name();
            String country=i.getCountry_name();
            int code1=i.getSport_id();
            int estaclishment=i.getTeam_establishment();
            result3 = result3 + "\n Team Id: " + code01 + "\n Name: " + name + "\n Stadium: " + stadium + "\n City: " + city + "\n Country: " + country + "\n sport id: " + code1 + "\n Year of estaclishment: " + estaclishment + "\n";
        }
        querytextView.setText("---Sport---" + "\n" + result + "\n" +"---Athlete---" + "\n" + result2 + "\n" + "---Team---"  + result3);


        return  view;
    }


}