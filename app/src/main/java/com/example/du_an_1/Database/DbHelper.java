package com.example.du_an_1.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.du_an_1.DAO.CustomerDao;
import com.example.du_an_1.DAO.DrinksDao;
import com.example.du_an_1.DAO.FoodDao;
import com.example.du_an_1.DAO.InvoiceFoodDao;
import com.example.du_an_1.DAO.InvoiceDrinkDao;
import com.example.du_an_1.DAO.InvoiceDetailDrinkDao;
import com.example.du_an_1.DAO.InvoiceDetailFoodDao;
import com.example.du_an_1.DAO.StaffDao;

public class DbHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "FoodApp";
    public static final int DB_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CustomerDao.CREATE_TABLE_CUSTOMER);
        db.execSQL(DrinksDao.CREATE_TABLE_DRINKS);
        db.execSQL(FoodDao.CREATE_TABLE_FOOD);
        db.execSQL(InvoiceFoodDao.CREATE_TABLE_INVOICE_FOOD);
        db.execSQL(InvoiceDrinkDao.CREATE_TABLE_INVOICE_DRINK);
        db.execSQL(InvoiceDetailDrinkDao.CREATE_TABLE_INVOICE_DETAIL_DRINK);
        db.execSQL(InvoiceDetailFoodDao.CREATE_TABLE_INVOICE_DETAIL_FOOD);
        db.execSQL(StaffDao.CREATE_TABLE_STAFF);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CustomerDao.DROP_TABLE_CUSTOMER);
        db.execSQL(DrinksDao.DROP_TABLE_DRINKS);
        db.execSQL(FoodDao.DROP_TABLE_FOOD);
        db.execSQL(InvoiceFoodDao.DROP_TABLE_INVOICE_FOOD);
        db.execSQL(InvoiceDrinkDao.DROP_TABLE_INVOICE_DRINK);
        db.execSQL(InvoiceDetailDrinkDao.DROP_TABLE_INVOICE_DETAIL_DRINK);
        db.execSQL(InvoiceDetailFoodDao.DROP_TABLE_INVOICE_DETAIL_FOOD);
        db.execSQL(StaffDao.DROP_TABLE_STAFF);
    }
}
