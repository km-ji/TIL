package com.hanyang.addresslist.ui.main;

import androidx.lifecycle.ViewModel;


import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.Room;


import com.hanyang.addresslist.AddressInfo;
import com.hanyang.addresslist.AppDatabase;

import java.util.List;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    LiveData<List<AddressInfo>> address;

    public void insertAddressInfo(Context context,AddressInfo data){
        AppDatabase.getInstance(context).getAddressInfoDao().insertAddress(data);
    }
    public LiveData<List<AddressInfo>> getAddress(Context context) {
        if (address==null){
            address=AppDatabase.getInstance(context).getAddressInfoDao().getAddressLiveData();

        }
        return address;

    }
}