package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class DrinksDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;

    public static final String TABLE_NAME = "drinks";
    public static final String ID_DRINKS = "idDrinks";
    public static final String NAME_DRINKS = "nameDrinks";
    public static final String PICTURE_DRINKS = "pictureDrinks";
    public static final String PRICE_DRINKS = "priceDrinks";
    public static final String EVALUATE_DRINKS = "evaluateDrinks";
    public static final String DESCRIBE_DRINKS = "describeDrinks";

    public static final String CREATE_TABLE_DRINKS = "CREATE TABLE " + TABLE_NAME + "(" +
            ID_DRINKS + "TEXT PRIMARY KEY, " +
            NAME_DRINKS + "TEXT, " +
            PICTURE_DRINKS + "BLOB, " +
            PRICE_DRINKS + "INTEGER, " +
            EVALUATE_DRINKS + "TEXT, " +
            DESCRIBE_DRINKS + "TEXT);";

    public static final String DROP_TABLE_DRINKS="DROP TABLE IF EXIST "+TABLE_NAME;

    public DrinksDao(Context context){
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }

}
