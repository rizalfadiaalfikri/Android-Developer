package com.rizalfadiaalfikri.a07_fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentStatePagerAdapter {

    Context context;
    int jumlah_tab;

    public VPAdapter(FragmentManager fragmentManager, Context context, int jumlah_tab) {
        super(fragmentManager);
        this.context = context;
        this.jumlah_tab = jumlah_tab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FragmentChat();
            case 1: return new FragmentStatus();
            case 2: return new FragmentCall();
        }
        return null;
    }

    @Override
    public int getCount() {
        return jumlah_tab;
    }
}
