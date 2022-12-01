package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inclassbatch2.onboardingwithnavigationcomponentjava.databinding.FragmentViewPagerBinding;

import java.util.ArrayList;

public class ViewPagerFragment extends Fragment {


    FragmentViewPagerBinding binding;
    ArrayList<Fragment> fragmentArrayList ;

    public ViewPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding  = FragmentViewPagerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();


        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new FirstFragment());
        fragmentArrayList.add(new SecondFragment());
        fragmentArrayList.add(new ThirdFragment());


        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity(),fragmentArrayList);
        ViewPager2 viewPager2 = binding.viewPager;
        viewPager2.setAdapter(adapter);

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_view_pager, container, false);





        return view;
    }
}