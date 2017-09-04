package com.cydia.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by huizhangh on 2017/9/4.
 */

public class PodcastFragment extends Fragment {

    private TextView mDisplayTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_podcast, container, false);
        mDisplayTv = (TextView) view.findViewById(R.id.content);
        return view;
    }
}
