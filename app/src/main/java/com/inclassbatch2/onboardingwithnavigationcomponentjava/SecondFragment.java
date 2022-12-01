package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inclassbatch2.onboardingwithnavigationcomponentjava.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    FragmentSecondBinding binding;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        ViewPager2 viewPager2 = requireActivity().findViewById(R.id.view_pager);
        binding.button2.setOnClickListener(v -> {
            viewPager2.setCurrentItem(2,true);
        });
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false);
        return  view;
    }
}