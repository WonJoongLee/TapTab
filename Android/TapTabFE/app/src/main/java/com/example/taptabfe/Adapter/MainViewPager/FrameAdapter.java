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
            case 0:
                Frame_YSJ frame_ysj = new Frame_YSJ();
                return frame_ysj;
                //return Frame_YSJ.newInstance();
            case 1:
                return Frame_YJJ.newInstance();//양진재
            case 2:
                return Frame_KSJ.newInstance();//개성재
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
