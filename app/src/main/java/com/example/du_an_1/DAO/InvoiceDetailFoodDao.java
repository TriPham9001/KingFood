package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class InvoiceDetailFoodDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;
    public static final String TABLE_NAME = "inVoiceDetail";
    public static final String ID_STAFF = "idStaff";
    public static final String AMOUNT_FOOD = "amountFood";
    public static final String DISCOUNT = "disCount";
    public static final String TIME_PAY = "timePay";

    //bảng này chưa có khóa chính do tui chưa xác định được cái nào là khóa chính
    public static final String CREATE_TABLE_INVOICE_DETAIL_FOOD = "CREATE TABLE " + TABLE_NAME + " (" +
            ID_STAFF + "TEXT" +
            AMOUNT_FOOD + "INTEGER, " +
            DISCOUNT + "TEXT, " +
            TIME_PAY + "TEXT);";

    public static final String DROP_TABLE_INVOICE_DETAIL_FOOD = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public InvoiceDetailFoodDao(Context context) {
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }
}
