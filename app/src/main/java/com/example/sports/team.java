package com.example.sports;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

@Entity (tableName ="team",
        primaryKeys = {"TSid" , "Tid"},
     foreignKeys = {
        @ForeignKey(entity = Sport.class,
                parentColumns = "Sid",
                childColumns = "TSid",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE)})

public class Team {
    @ColumnInfo (name = "Tid")@NonNull
    private  int id;
    @ColumnInfo (name="Tname")
    private  String team_name;
    @ColumnInfo (name="stadium")
    private   String  stadium_name;
    @ColumnInfo (name="city")
    private  String city_name;
    @ColumnInfo  (name="Country")
    private  String country_name;
    @ColumnInfo (name="TSid") @NonNull
    private  int  sport_id;
    @ColumnInfo(name="estaclishment")
    private  int team_establishment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getSport_id() {
        return sport_id;
    }

    public void setSport_id(int sport_id) {
        this.sport_id = sport_id;
    }

    public int getTeam_establishment() {
        return team_establishment;
    }

    public void setTeam_establishment(int team_establishment) {
        this.team_establishment = team_establishment;
    }
}
