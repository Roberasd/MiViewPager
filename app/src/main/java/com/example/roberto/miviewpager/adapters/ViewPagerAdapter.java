package com.example.roberto.miviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.roberto.miviewpager.fragments.FragmentNumeroDos;
import com.example.roberto.miviewpager.fragments.FragmentNumeroUno;

/**
 * Created by Roberto Avalos on 08/10/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private CharSequence mTitles[];
    private int mNumbOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabs) {
        super(fm);

        this.mTitles = mTitles;
        this.mNumbOfTabs = mNumbOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return FragmentNumeroUno.newInstance();
        }else{
            return FragmentNumeroDos.newInstance();
        }
    }

    @Override
    public int getCount() {
        return mNumbOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
