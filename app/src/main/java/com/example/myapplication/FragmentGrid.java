package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentGrid extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_grid, container, false);

        RecyclerView rv = view.findViewById(R.id.rvGrid);

        rv.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rv.setAdapter(new ItemAdapter(generateData())); // giờ generateData trả List<ItemData>

        return view;
    }

    // Trả về List<ItemData> (không phải List<String>)
    private List<ItemData> generateData() {
        List<ItemData> list = new ArrayList<>();

        // Danh sách ảnh mẫu - dùng các file drawable bạn đã thêm
        int[] images = new int[] {
                R.drawable.ic_cuc,
                R.drawable.ic_tuylip,
                R.drawable.ic_rose,
                R.drawable.ic_tudang
        };

        // Tạo 30 mục mẫu, lặp qua images
        for (int i = 0; i < 10; i++) {
            String title = "Item " + (i + 1);
            int img = images[i % images.length];
            list.add(new ItemData(title, img));
        }
        return list;
    }
}
