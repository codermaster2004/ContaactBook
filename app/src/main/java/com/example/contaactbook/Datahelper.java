package com.example.contaactbook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Datahelper extends SQLiteOpenHelper {

    public Datahelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String abc = "create table Mycontacts (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, contacts TEXT)";
        db.execSQL(abc);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void Insertcontaacts(String myname, String mycontact) {

        String query = "insert into Mycontacts (name, contact) values('"+myname+"', '"+mycontact+"')";
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL(query);
    }
}
