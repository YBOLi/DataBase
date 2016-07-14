package com.example.e5.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import database.PersonSQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {
    PersonSQLiteOpenHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         helper=new PersonSQLiteOpenHelper(this);
        SQLiteDatabase db=helper.getWritableDatabase();

    }
}
