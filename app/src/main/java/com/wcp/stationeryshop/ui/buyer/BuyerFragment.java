package com.wcp.stationeryshop.ui.buyer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.wcp.stationeryshop.R;

public class BuyerFragment extends Fragment {

    private BuyerViewModel buyerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        buyerViewModel =ViewModelProviders.of(this).get(BuyerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buyer, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        buyerViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}