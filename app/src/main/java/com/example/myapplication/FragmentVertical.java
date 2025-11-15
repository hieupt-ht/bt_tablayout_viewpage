package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class FragmentVertical extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_vertical, container, false);
        RecyclerView rv = view.findViewById(R.id.rvVertical);

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new ItemAdapter(getData()));
        return view;
    }

    private List<ItemData> getData() {
        List<ItemData> list = new ArrayList<>();

        list.add(new ItemData("Hoa cúc", R.drawable.ic_cuc));
        list.add(new ItemData("Hoa tuylip", R.drawable.ic_tuylip));
        list.add(new ItemData("Hoa hồng", R.drawable.ic_rose));
        list.add(new ItemData("Hoa tử đằng", R.drawable.ic_tudang));

        return list;
    }

}
