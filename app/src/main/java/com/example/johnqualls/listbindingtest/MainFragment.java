package com.example.johnqualls.listbindingtest;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.johnqualls.listbindingtest.databinding.FragmentMainBinding;

/**
 * Created by john.qualls on 2/13/2017.
 */

public class MainFragment extends Fragment {

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       FragmentMainBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        // Set list items
        ScopeTextList list = new ScopeTextList();
        binding.setScopeTextList(list);
        return binding.getRoot();
    }
}
