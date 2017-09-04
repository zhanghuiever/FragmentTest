package com.cydia.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by huizhangh on 2017/9/4.
 */

public class TitleFragment extends Fragment{

    private ImageButton mBackBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title, container, false);
        mBackBtn = (ImageButton) view.findViewById(R.id.back);
        mBackBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This is back button", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
