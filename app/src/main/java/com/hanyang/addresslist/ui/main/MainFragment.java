package com.hanyang.addresslist.ui.main;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanyang.addresslist.AddressInfo;
import com.hanyang.addresslist.CustomAdapter;
import com.hanyang.addresslist.R;
import com.hanyang.addresslist.databinding.MainFragmentBinding;

import java.util.List;

public class MainFragment extends Fragment {
    private MainFragmentBinding binding;
    private MainViewModel mViewModel;
    private NavController controller;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MainFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        controller = NavHostFragment.findNavController(this);
        binding.btnMainAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.navigate(R.id.action_mainFragment_to_inputFragment);
            }
        });
        final Observer<List<AddressInfo>> observer = new Observer<List<AddressInfo>>() {
            @Override
            public void onChanged(List<AddressInfo> addressInfos) {
                CustomAdapter adapter = new CustomAdapter(getActivity().getApplicationContext(),controller, addressInfos);
                binding.lstAddress.setAdapter(adapter);
            }
        };
        mViewModel=new ViewModelProvider(this).get(MainViewModel.class);
        mViewModel.getAddress(getActivity().getApplicationContext()).observe(getViewLifecycleOwner(), observer);
        return view;
    }

}