package com.inclassbatch2.onboardingwithnavigationcomponentjava;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {
    List<Fragment> fragmentList ;
    public ViewPagerAdapter(FragmentActivity activity,ArrayList<Fragment> fragmentArrayList) {
        super(activity);
        this.fragmentList = fragmentArrayList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
