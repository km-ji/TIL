package com.hanyang.addresslist.ui.main;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanyang.addresslist.AddressInfo;
import com.hanyang.addresslist.AddressInfoDao;
import com.hanyang.addresslist.AppDatabase;
import com.hanyang.addresslist.CustomAdapter;
import com.hanyang.addresslist.R;
import com.hanyang.addresslist.databinding.InputFragmentBinding;

import java.util.List;

public class InputFragment extends Fragment {
    private InputFragmentBinding binding;
    private MainViewModel mViewModel;
    private NavController controller;
    public static ViewFragment newInstance() {
        return new ViewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding=InputFragmentBinding.inflate(inflater,container,false);
        View view=binding.getRoot();
        controller= NavHostFragment.findNavController(this);
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=binding.txtId.getText().toString();
                String phone=binding.txtPhone.getText().toString();
                String age=binding.txtAge.getText().toString();
                String address=binding.txtAddress.getText().toString();
                AddressInfo info=new AddressInfo();
                info.setAddress(address);
                info.setPhone(phone);
                info.setAge(Integer.parseInt(age));
                info.setName(name);
                AppDatabase db=AppDatabase.getInstance(getActivity().getApplicationContext());
                AddressInfoDao dao=db.getAddressInfoDao();
                dao.insertAddress(info);
                controller.popBackStack();
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