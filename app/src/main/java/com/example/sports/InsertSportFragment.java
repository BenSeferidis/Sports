package com.example.sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertSportFragment extends Fragment {
    EditText edittext1,edittext2,edittext3,edittext4,edittext5,edittext6,edittext7;
    Button Iinsert;
    public InsertSportFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_insert_sport,container,false);
        edittext1= view.findViewById(R.id.insertText1);
        edittext2= view.findViewById(R.id.insertText2);
        edittext3= view.findViewById(R.id.insertText3);
        edittext4= view.findViewById(R.id.insertText4);

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
                String  var_name_sport=edittext2.getText().toString();
                String var_kind_sport=edittext3.getText().toString();
                String var_gender=edittext4.getText().toString();

                try {
                    Sport sport = new Sport();
                    sport.setId(var_id);
                    sport.setSport_name(var_name_sport);
                    sport.setKind_sport(var_kind_sport);
                    sport.setGender(var_gender);
                    MainActivity.myAppDatabase.myDao().insertSport(sport);
                    Toast.makeText(getActivity(),"Record added.",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(),message,Toast.LENGTH_LONG).show();
                }
                edittext1.setText("");
                edittext2.setText("");
                edittext3.setText("");
                edittext4.setText("");

            }
        });
        return view;
    }
}
