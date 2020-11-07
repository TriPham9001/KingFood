package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class StaffDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;
    public static final String TABLE_NAME = "staff";
    public static final String NAME_STAFF = "nameStaff";
    public static final String ID_STAFF = "idStaff";
    public static final String PHONE = "phone";
    public static final String ADDRESS = "address";

    public static final String CREATE_TABLE_STAFF = "CREATE TABLE " + TABLE_NAME + " (" +
            NAME_STAFF + "TEXT, " +
            ID_STAFF + "TEXT PRIMARY KEY, " +
            PHONE + "INTEGER, " +
            ADDRESS + "TEXT);";

    public static final String DROP_TABLE_STAFF = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public StaffDao(Context context) {
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }
}
