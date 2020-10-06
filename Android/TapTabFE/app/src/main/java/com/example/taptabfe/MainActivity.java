package com.example.taptabfe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.taptabfe.Adapter.MainBanner.DataBean;
import com.example.taptabfe.Adapter.MainBanner.ImageAdapter;
import com.example.taptabfe.Adapter.MainViewPager.FrameAdapter;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;
import com.youth.banner.indicator.RectangleIndicator;
import com.youth.banner.util.BannerUtils;
import com.youth.banner.util.LogUtils;

public class MainActivity extends AppCompatActivity {

    //private FragmentPagerAdapter fragmentPagerAdapter;
    private ViewPager viewPager;
    FrameAdapter frameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager viewPager = findViewById(R.id.main_viewpager);
        //fragmentPagerAdapter = new FrameAdapter(getSupportFragmentManager());
        //viewPager.setAdapter(fragmentPagerAdapter);


        Banner banner;
        banner = findViewById(R.id.banner);

        ImageAdapter adapter = new ImageAdapter(DataBean.getTestData());

        banner.setAdapter(adapter)
                .addBannerLifecycleObserver(this)
                .setIndicator(new RectangleIndicator(this))
                .setIndicatorSelectedWidth((int) BannerUtils.dp2px(12))
                .setIndicatorSpace((int)BannerUtils.dp2px(4))
                .setIndicatorRadius(0)
                .setDelayTime(5000); // snackbar 제거

        viewPager = findViewById(R.id.main_viewpager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        frameAdapter = new FrameAdapter(getSupportFragmentManager());
        viewPager.setAdapter(frameAdapter);

    }
}
