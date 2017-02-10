package com.example.johnqualls.listbindingtest;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

/**
 * Created by john.qualls on 2/9/2017.
 */

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView view, ObservableArrayList<ScopeText> list) {
        ListAdapter adapter = new ListAdapter(list);
        view.setAdapter(adapter);
    }
}
