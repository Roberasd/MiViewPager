package com.example.roberto.miviewpager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roberto.miviewpager.R;

/**
 * Created by Roberto Avalos on 08/10/2015.
 */
public class FragmentNumeroUno extends Fragment{

    public static FragmentNumeroUno newInstance(){
        FragmentNumeroUno fragment = new FragmentNumeroUno();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_uno, container, false);
        return rootView;
    }
}
