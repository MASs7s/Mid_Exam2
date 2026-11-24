package com.example.authtabs;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    private static final String ARG = "title";

    public static PageFragment newInstance(String title) {
        PageFragment f = new PageFragment();
        Bundle b = new Bundle();
        b.putString(ARG, title);
        f.setArguments(b);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle state) {
        TextView tv = new TextView(requireContext());
        String title = getArguments() != null ? getArguments().getString(ARG) : "";
        tv.setText(title + " Tab");
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }
}
