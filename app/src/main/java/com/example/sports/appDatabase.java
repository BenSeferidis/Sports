package com.example.sports;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Team.class,Sport.class,Athlete.class},version = 1, exportSchema = false)
public abstract class appDatabase extends RoomDatabase {
    public  abstract MyDao myDao();
}
