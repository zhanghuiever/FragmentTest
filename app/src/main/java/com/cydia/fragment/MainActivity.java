package com.cydia.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener{

    private LinearLayout mFavouriteTab;
    private LinearLayout mMusicTab;
    private LinearLayout mPodcastTab;
    private LinearLayout mSettingTab;

    private Fragment mFavouriteFragment;
    private Fragment mMusicFragment;
    private Fragment mPodcastFragment;
    private Fragment mSettingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        mFavouriteTab = (LinearLayout) findViewById(R.id.tab_favourite);
        mMusicTab = (LinearLayout) findViewById(R.id.tab_music);
        mPodcastTab = (LinearLayout) findViewById(R.id.tab_podcast);
        mSettingTab = (LinearLayout) findViewById(R.id.tab_setting);
        mFavouriteTab.setOnClickListener(this);
        mMusicTab.setOnClickListener(this);
        mPodcastTab.setOnClickListener(this);
        mSettingTab.setOnClickListener(this);

        //
        setDefaultFragment();
    }

    private void setDefaultFragment(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mFavouriteFragment = new FavouriteFragment();
        transaction.replace(R.id.fragment_content, mFavouriteFragment);
        transaction.commit();
    }
    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (v.getId()){
            case R.id.tab_favourite:
                if(mFavouriteFragment == null){
                    mFavouriteFragment = new FavouriteFragment();
                }
                transaction.replace(R.id.fragment_content, mFavouriteFragment);
                break;
            case R.id.tab_music:
                if(mMusicFragment == null){
                    mMusicFragment = new MusicFragment();
                }
                transaction.replace(R.id.fragment_content, mMusicFragment);
                break;
            case R.id.tab_podcast:
                if(mPodcastFragment == null){
                    mPodcastFragment = new PodcastFragment();
                }
                transaction.replace(R.id.fragment_content, mPodcastFragment);
                break;
            case R.id.tab_setting:
                if(mSettingFragment == null){
                    mSettingFragment = new SettingFragment();
                }
                transaction.replace(R.id.fragment_content, mSettingFragment);
                break;
            default:
        }
        transaction.commit();
    }
}
