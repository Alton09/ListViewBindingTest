package com.example.johnqualls.listbindingtest;

import android.databinding.ObservableArrayList;
import android.view.View;

/**
 * Created by john.qualls on 2/9/2017.
 */

public class ScopeTextList {
    public ObservableArrayList<ScopeText> list = new ObservableArrayList<>();
    private int mTotalCount;

    public ScopeTextList() {
        for (mTotalCount =1; mTotalCount <11; ++mTotalCount) {
            add(new ScopeText("ScopeText" + mTotalCount, true));
        }
    }

    // Called on add button click
    public void add(View v) {
        ++mTotalCount;
        list.add(new ScopeText("ScopeText" + mTotalCount, true));
    }

    // Called on remove button click
    public void remove(View v) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }

    private void add(ScopeText scopeText) {
        list.add(scopeText);
    }
}
