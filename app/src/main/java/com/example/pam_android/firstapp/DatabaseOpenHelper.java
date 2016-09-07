package com.example.pam_android.firstapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PAM-Android on 9/5/2016.
 */
public class DatabaseOpenHelper extends SQLiteOpenHelper {
    public DatabaseOpenHelper(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
    }

    private String createPeopleTable = "create table " + Constants.PEOPLE_TABLE_NAME
            + " (" + Constants.PEOPLE_COLUMN_NAME + " text not null, "
            + Constants.PEOPLE_COLUM_NUMBER + " text not null" + " );";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createPeopleTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Constants.PEOPLE_TABLE_NAME);
        onCreate(db);
    }
}
