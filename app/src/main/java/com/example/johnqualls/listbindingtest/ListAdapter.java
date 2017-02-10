package com.example.johnqualls.listbindingtest;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.johnqualls.listbindingtest.databinding.ListItemBinding;

/**
 * Created by john.qualls on 2/9/2017.
 */

public class ListAdapter extends BaseAdapter {
    private ObservableArrayList<ScopeText> list;
    private LayoutInflater inflater;

    public ListAdapter(ObservableArrayList<ScopeText> l) {
        list = l;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        ListItemBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.list_item, parent, false);
        binding.setScopeText(list.get(position));

        return binding.getRoot();
    }
}
