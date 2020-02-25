package com.example.loginone;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class DBManager {
    private DatabaseHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;
    public  DBManager(Context c){
        context=c;
    }
    public DBManager open(){
        dbHelper=new DatabaseHelper(context);
        database=dbHelper.getWritableDatabase();
        return this;
    }
    public void close() {
        dbHelper.close();
    }
    public void insert(String name, String surname) {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DatabaseHelper.COL_2, name);
        contentValue.put(DatabaseHelper.COL_3, surname);
        database.insert(DatabaseHelper.TABLE_NAME, null, contentValue);
    }
}
