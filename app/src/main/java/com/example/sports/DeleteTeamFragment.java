package com.example.sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteTeamFragment extends Fragment{

        EditText editText, editText1;
        Button button;
        public DeleteTeamFragment(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view =inflater.inflate(R.layout.fragment_delete_team,container,false);
            editText= view.findViewById(R.id.insertText1);
            editText1= view.findViewById(R.id.insertText2);
            button= view.findViewById(R.id.delete_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int var_id=0;
                    try {
                        var_id = Integer.parseInt(editText.getText().toString());
                    }catch(NumberFormatException ex ){
                        System.out.println("could not parse"+ ex);
                    }int var_sport_id = 0;
                    try {
                        var_sport_id = Integer.parseInt(editText1.getText().toString());
                    }catch(NumberFormatException ex ){
                        System.out.println("could not parse"+ ex);
                    }
                    Team team = new Team();
                    team.setId(var_id);
                    team.setSport_id(var_sport_id);
                    MainActivity.myAppDatabase.myDao().deleteTeam(team);
                    Toast.makeText(getActivity(),"TEAM DELETED",Toast.LENGTH_LONG).show();
                    editText.setText("");
                }
            });
            return view;
        }

}
