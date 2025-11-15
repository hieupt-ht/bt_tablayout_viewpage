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

public class FragmentHorizontal extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_horizontal, container, false);

        RecyclerView rv = view.findViewById(R.id.rvHorizontal);

        rv.setLayoutManager(
                new LinearLayoutManager(getContext(),
                        LinearLayoutManager.HORIZONTAL, false));

        rv.setAdapter(new ItemAdapter(generateData()));

        return view;
    }

    // Trả List<ItemData> thay vì List<String>
    private List<ItemData> generateData() {
        List<ItemData> list = new ArrayList<>();

        // Mảng ảnh có trong thư mục drawable của bạn
        int[] images = new int[] {
                R.drawable.ic_cuc,
                R.drawable.ic_tuylip,
                R.drawable.ic_rose,
                R.drawable.ic_tudang
        };

        // Tạo 10 item mẫu (bạn có thể thay đổi)
        for (int i = 0; i < 10; i++) {
            String title = "Item " + (i + 1);
            int img = images[i % images.length];
            list.add(new ItemData(title, img));
        }
        return list;
    }
}
