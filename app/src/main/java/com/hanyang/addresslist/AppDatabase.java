package com.hanyang.addresslist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities={AddressInfo.class},version=1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;
    public abstract AddressInfoDao getAddressInfoDao();
    public static AppDatabase getInstance(Context context){
        if(instance==null) {
            instance= Room.databaseBuilder(context, AppDatabase.class,"appdatabase").allowMainThreadQueries().build();
        }
        return instance;
    }
}
