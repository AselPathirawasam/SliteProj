package com.example.sliteproj;

public class Constants {

    // db name
    public static final String DB_NAME = "REGISTER _INFO_DB";
    // db version
    public static final int DB_VERSION = 1;
    // db table name
    public static final String TABLE_NAME = "REGISTER_INFO_TABLE";
    // columns of table
    public static final String C_ID = "ID";
    public static final String C_FNAME = "FNAME";
    public static final String C_LNAME = "LNAME";
    public static final String C_NIC = "NIC";
    public static final String C_CNUMBER = "CNUMBER";
    public static final String C_EMAIL = "EMAIL";
    public static final String C_PASSWORD = "PASSWORD";
    public static final String C_CPASSWORD = "CPASSWORD";
    public static final String C_IMAGE = "IMAGE";
    public static final String C_Add_TIMESTAMP = "TIMESTAMP";
    public static final String C_UPDATED_TIMESTAMP = "UPDATED_TIMESTAMP";
    // create table query
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_FNAME + " TEXT,"
            + C_LNAME + " TEXT,"
            + C_NIC + " TEXT,"
            + C_IMAGE + " TEXT,"
            + C_EMAIL + " TEXT,"
            + C_PASSWORD + " TEXT,"
            + C_CNUMBER + " TEXT,"
            + C_CPASSWORD + " TEXT,"
            + C_Add_TIMESTAMP + " TEXT,"
            + C_UPDATED_TIMESTAMP + " TEXT"
            + ");";

}
