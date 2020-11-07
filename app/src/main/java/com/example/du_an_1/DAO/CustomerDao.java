package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class CustomerDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;
    public static final String TABLE_NAME = "customer";
    public static final String USER_NAME = "userName";
    public static final String PASS_WORD = "passWord";
    public static final String EMAIL = "email";

    public static final String CREATE_TABLE_CUSTOMER = "CREATE TABLE " + TABLE_NAME + " (" +
            USER_NAME + "TEXT PRIMARY KEY, " +
            PASS_WORD + "TEXT, " +
            EMAIL + "TEXT);";

    public static final String DROP_TABLE_CUSTOMER = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public CustomerDao(Context context) {
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }
}
