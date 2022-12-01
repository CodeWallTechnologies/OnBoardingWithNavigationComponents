package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SplashScreenFragment extends Fragment {



    public SplashScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_splash_screen, container, false);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                boolean status = onBoardingFinish();

                if(status){
                    Intent intent = new Intent(getActivity(),HomeActivity.class);
                    startActivity(intent);
                }else {
//                    NavHostFragment.findNavController(new SplashScreenFragment()).navigate(R.id.action_splashScreenFragment3_to_viewPagerFragment);
                    // Get the navigation host fragment from this Activity
                    NavHostFragment navHostFragment = (NavHostFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
// Instantiate the navController using the NavHostFragment
                    NavController navController = navHostFragment.getNavController();
                    navController.navigate(R.id.action_splashScreenFragment3_to_viewPagerFragment);

// Make sure actions in the ActionBar get propagated to the NavController
//                    setupActionBarWithNavController(this, navController);
                }

            }
        },5000);


        // Inflate the layout for this fragment
        return view;


    }

    private boolean onBoardingFinish() {
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("condition", Context.MODE_PRIVATE);
        boolean result = sharedPreferences.getBoolean("status",false);
        return  result;
    }
}