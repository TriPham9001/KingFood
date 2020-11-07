package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class InvoiceFoodDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;
    public static final String TABLE_NAME = "inVoiceFood";
    public static final String ID_INVOICE = "idInvoiceFood";
    public static final String NAME_DRINKS = "nameFood";
    public static final String TOTAL = "toTal";

    public static final String CREATE_TABLE_INVOICE_FOOD = "CREATE TABLE " + TABLE_NAME + " (" +
            ID_INVOICE + "TEXT PRIMARY KEY, " +
            NAME_DRINKS + "TEXT, " +
            TOTAL + "TEXT);";

    public static final String DROP_TABLE_INVOICE_FOOD = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public InvoiceFoodDao(Context context) {
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }
}
