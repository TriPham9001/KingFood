package com.example.du_an_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.du_an_1.Database.DbHelper;

public class FoodDao {
    private SQLiteDatabase db;
    private DbHelper DbHelper;
    private Context context;

    public static final String TABLE_NAME = "food";
    public static final String ID_FOOD = "idFood";
    public static final String NAME_FOOD = "nameFood";
    public static final String PICTURE_FOOD = "pictureFood";
    public static final String PRICE_FOOD = "priceFood";
    public static final String EVALUATE_FOOD = "evaluateFood";
    public static final String DESCRIBE_FOOD = "describeFood";

    public static final String CREATE_TABLE_FOOD = "CREATE TABLE " + TABLE_NAME + "(" +
            ID_FOOD + "TEXT PRIMARY KEY, " +
            NAME_FOOD + "TEXT, " +
            PICTURE_FOOD + "BLOB, " +
            PRICE_FOOD + "INTEGER, " +
            EVALUATE_FOOD + "TEXT, " +
            DESCRIBE_FOOD + "TEXT);";

    public static final String DROP_TABLE_FOOD="DROP TABLE IF EXIST "+TABLE_NAME;

    public FoodDao(Context context){
        DbHelper = new DbHelper(context);
        db = DbHelper.getReadableDatabase();
        db = DbHelper.getWritableDatabase();
    }
}
