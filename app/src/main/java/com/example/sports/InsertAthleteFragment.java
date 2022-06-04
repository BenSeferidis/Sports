package com.example.sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertAthleteFragment extends Fragment {
    EditText edittext1,edittext2,edittext3,edittext4,edittext5,edittext6,edittext7;
    Button Iinsert;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_insert_athlete,container,false);
        edittext1= view.findViewById(R.id.insertText1);
        edittext2= view.findViewById(R.id.insertText2);
        edittext3= view.findViewById(R.id.insertText3);
        edittext4= view.findViewById(R.id.insertText4);
        edittext5= view.findViewById(R.id.insertText5);
        edittext6= view.findViewById(R.id.insertText6);
        edittext7= view.findViewById(R.id.insertText7);
        Iinsert= view.findViewById(R.id.insert_button);
        Iinsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int var_id=0;
                try {
                    var_id = Integer.parseInt(edittext1.getText().toString());
                }catch(NumberFormatException ex ){
                    System.out.println("could not parse"+ ex);
                }
                String  var_name=edittext2.getText().toString();
                String var_last_name=edittext3.getText().toString();
                String var_city=edittext4.getText().toString();
                String var_country=edittext5.getText().toString();
                int var_sid = 0;
                try {
                    var_sid = Integer.parseInt(edittext6.getText().toString());
                }catch(NumberFormatException ex ){
                    System.out.println("could not parse"+ ex);
                }
                int var_year = 0;
                try {
                    var_year = Integer.parseInt(edittext7.getText().toString());
                }catch(NumberFormatException ex ){
                    System.out.println("could not parse"+ ex);
                }

                try {
                    Athlete athlete = new Athlete();
                    athlete.setAid(var_id);
                    athlete.setName(var_name);
                    athlete.setLname(var_last_name);
                    athlete.setCity(var_city);
                    athlete.setCountry(var_country);
                    athlete.setAisid(var_sid);
                    athlete.setYear(var_year);

                    MainActivity.myAppDatabase.myDao().insertAthlete(athlete);
                    Toast.makeText(getActivity(),"Record added.",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(),message,Toast.LENGTH_LONG).show();
                }
                edittext1.setText("");
                edittext2.setText("");
                edittext3.setText("");
                edittext4.setText("");
                edittext5.setText("");
                edittext6.setText("");
                edittext7.setText("");
            }
        });
        return view;
    }

}
