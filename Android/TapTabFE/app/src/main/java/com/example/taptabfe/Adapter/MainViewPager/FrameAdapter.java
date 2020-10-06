package com.example.taptabfe.Adapter.MainViewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FrameAdapter extends FragmentPagerAdapter {


    public FrameAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: // 양성재
                Frame_YSJ frame_ysj = new Frame_YSJ();
                return frame_ysj;
            case 1: // 양진재
                Frame_YJJ frame_yjj = new Frame_YJJ();
                return frame_yjj;
            case 2: // 개성재
                Frame_KSJ frame_ksj = new Frame_KSJ();
                return frame_ksj;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "양성재";
            case 1:
                return "양진재";
            case 2:
                return "개성재";
        }
        return null;
    }

}
