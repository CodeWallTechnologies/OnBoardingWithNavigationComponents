package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inclassbatch2.onboardingwithnavigationcomponentjava.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    FragmentThirdBinding binding;


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentThirdBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        binding.button3.setOnClickListener(v -> {

            onBoardingFinish();
            Intent intent = new Intent(view.getContext(),HomeActivity.class);
            startActivity(intent);

        });

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third, container, false);
        return  view;
    }

    private void onBoardingFinish() {
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("condition", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("status",true);
        editor.commit();
    }
}