package com.lom.game;

/**
 * Created by amitrevski on 1/14/17.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

class SqLiteAndroidDbHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "lom";

    public SqLiteAndroidDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
