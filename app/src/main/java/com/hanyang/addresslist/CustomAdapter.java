package com.hanyang.addresslist;


import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.navigation.NavController;

import com.hanyang.addresslist.databinding.ListcellBinding;

import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<AddressInfo> address;
    LayoutInflater inflter;
    NavController controller;

    public CustomAdapter(Context applicationContext,NavController ctrl, List<AddressInfo> list){
        this.context=context;
        this.address=list;
        this.controller=ctrl;
        inflter=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return address.size();
    }

    @Override
    public Object getItem(int i) { return address.get(i); }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        ListcellBinding binding=ListcellBinding.inflate(inflter);
        AddressInfo info=address.get(i);
        binding.textCellAge.setText(""+info.getAge());
        binding.textCellPhone.setText(""+info.getPhone());
        binding.textCellName.setText(""+info.getName());
        binding.btnCellDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppDatabase.getInstance(context).getAddressInfoDao().deleteAddress(info);
            }
        });

        binding.btnCellModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("ID",""+info.id);
                controller.navigate(R.id.action_mainFragment_to_editFragment,bundle);
            }
        });
        View cellview=binding.getRoot();
        return cellview;

    }
}
