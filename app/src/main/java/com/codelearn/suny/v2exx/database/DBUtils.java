package com.codelearn.suny.v2exx.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by suny on 2017/5/19.
 */

public class DBUtils {

    private DatebaseHlper mDatebaseHlper;

    public DBUtils(Context context) {
        mDatebaseHlper = new DatebaseHlper(context);

    }

    public void add(String topic_id) {

        String sql = "delete from v2ex";

        SQLiteDatabase db = mDatebaseHlper.getWritableDatabase();
        db.execSQL(sql);
        ContentValues values = new ContentValues();
        values.put(Constants.TOPIC_ID, topic_id);
//        values.put(Constants.COMMENT, comment);
        db.insert(Constants.TABLE_NAME, null, values);
        db.close();
    }


}
