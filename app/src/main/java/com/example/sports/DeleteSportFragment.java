package com.example.sports;

import android.arch.persistence.room.Delete;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteSportFragment  extends Fragment {
    EditText editText;
    Button  button;
    public DeleteSportFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_delete_sport,container,false);
        editText= view.findViewById(R.id.insertText1);
        button= view.findViewById(R.id.delete_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int var_id=0;
                try {
                    var_id = Integer.parseInt(editText.getText().toString());
                }catch(NumberFormatException ex ){
                    System.out.println("could not parse"+ ex);
                }
                Sport sport = new Sport();
                sport.setId(var_id);
                MainActivity.myAppDatabase.myDao().deleteSport(sport);
                Toast.makeText(getActivity(),"SPORT DELETED",Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });
        return view;
    }
}