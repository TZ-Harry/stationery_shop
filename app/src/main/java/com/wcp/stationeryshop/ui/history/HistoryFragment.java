package com.wcp.stationeryshop.ui.history;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.wcp.stationeryshop.R;
import com.wcp.stationeryshop.ui.ViewDetailSellItem;

public class HistoryFragment extends Fragment {

    private HistoryViewModel historyViewModel;

    private Button btnViewDetail,btnViewDetail2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        historyViewModel =
                ViewModelProviders.of(this).get(HistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_history, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        historyViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        btnViewDetail=root.findViewById(R.id.btnViewDetail);
        btnViewDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ViewDetailSellItem.class);
                startActivity(intent);
            }
        });
        btnViewDetail2=root.findViewById(R.id.btnViewDetail2);
        btnViewDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ViewDetailSellItem.class);
                startActivity(intent);
            }
        });
        return root;
    }
}