package com.example.biolink.view.activity;

import androidx.fragment.app.Fragment;

import com.example.biolink.view.fragment.MainPageFragment;

public class MainPageActivity extends SingleActivityFragment {

    @Override
    public Fragment createFragment() {
        return new MainPageFragment();
    }


}