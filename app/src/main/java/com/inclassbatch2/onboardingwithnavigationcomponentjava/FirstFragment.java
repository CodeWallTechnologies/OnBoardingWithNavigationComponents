package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inclassbatch2.onboardingwithnavigationcomponentjava.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

    FragmentFirstBinding binding;



    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentFirstBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();

//        View view = inflater.inflate(R.layout.fragment_first, container, false);

        binding.button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        return view;
    }
}