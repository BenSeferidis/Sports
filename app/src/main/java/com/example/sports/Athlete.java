package com.example.sports;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName ="athlete",

        primaryKeys = {"ASid" ,"Aid"},
        foreignKeys = {
                @ForeignKey(entity = Sport.class,
                        parentColumns = "Sid",
                        childColumns = "ASid",
                        onDelete = ForeignKey.CASCADE,
                        onUpdate = ForeignKey.CASCADE)})

public class Athlete {

    @ColumnInfo (name ="Aid") @NonNull
    private  int aid;
    @ColumnInfo (name = "Name")
    private  String name;
    @ColumnInfo (name = "Lname")
    private   String lname;
    @ColumnInfo (name = "City")
    private  String city;
    @ColumnInfo (name = "Country")
    private   String country;
    @ColumnInfo (name = "ASid") @NonNull
    private  int aisid;
    @ColumnInfo (name = "YearBirth")
    private  int year;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAisid() {
        return aisid;
    }

    public void setAisid(int aisid) {
        this.aisid = aisid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
