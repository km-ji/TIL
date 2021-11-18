package com.hanyang.addresslist.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanyang.addresslist.AddressInfo;
import com.hanyang.addresslist.AppDatabase;
import com.hanyang.addresslist.R;
import com.hanyang.addresslist.databinding.EditFragmentBinding;
import com.hanyang.addresslist.databinding.InputFragmentBinding;

public class EditFragment extends Fragment {
    private EditFragmentBinding binding;
    private MainViewModel mViewModel;

    public static EditFragment newInstance() {
        return new EditFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding=EditFragmentBinding.inflate(inflater,container,false);
        View view=binding.getRoot();
        Bundle bundle=getArguments();
        String id=bundle.getString();
        AddressInfo info= AppDatabase.getInstance(getActivity().getApplicationContext())
                .getAddressInfoDao().getAddressInfo(Integer.parseInt(id));
        binding.txtEditId.setText(info.getName());
        binding.txtEditPhone.setText(info.getPhone());
        binding.txtEidtAge.setText(info.getAge());
        binding.txtEditAddress.setText(info.getAddress());
        binding.btnModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}