package com.hanyang.addresslist;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AddressInfoDao {
    @Insert
    public void insertAddress(AddressInfo info);
    @Update
    public void updateAddress(AddressInfo info);
    @Delete
    public void deleteAddress(AddressInfo info);

    @Query("SELECT * FROM AddressInfo WHERE id=:id" )
    public AddressInfo getAddressInfo(int id);

    @Query("SELECT * FROM AddressInfo")
    public List<AddressInfo> getAllAddress();
    @Query("SELECT*FROM AddressInfo")
    public LiveData<List<AddressInfo>> getAddressLiveData();
}

