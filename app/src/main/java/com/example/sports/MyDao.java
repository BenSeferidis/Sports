package com.example.sports;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
@Dao
public interface MyDao {
    @Insert
    public void insertTeam(Team team);
    @Insert
    public void insertSport(Sport sport);
    @Insert
    public void insertAthlete(Athlete athlete);
    @Delete
    public void deleteSport(Sport sport);
    @Delete
    public void deleteTeam(Team team);
    @Delete
    public void deleteAthlete(Athlete athlete);


}