package com.codelearn.suny.v2exx.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by suny on 2017/5/19.
 */

public class DatebaseHlper extends SQLiteOpenHelper {
    public DatebaseHlper(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table v2ex(topic_id varchar,comment varchar)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
