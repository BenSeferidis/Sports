package com.example.sports;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity(tableName ="sport" )
public class Sport {


    @ColumnInfo(name="Sid")
    @PrimaryKey
    private  int id;
    @ColumnInfo (name="Sname")
    private  String sport_name;
    @ColumnInfo (name="Ksport")
    private String  kind_sport;
    @ColumnInfo (name="Gender")
    private String gender;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSport_name() {
        return sport_name;
    }

    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
    }

    public String getKind_sport() {
        return kind_sport;
    }

    public void setKind_sport(String kind_sport) {
        this.kind_sport = kind_sport;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
