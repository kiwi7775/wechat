package com.example.wechat;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wechat.adapter.MyFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentAdapter myFragmentAdapter;

    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
    }

    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        one = mTabLayout.getTabAt(0);
        two = mTabLayout.getTabAt(1);
        three = mTabLayout.getTabAt(2);
        four = mTabLayout.getTabAt(3);

        one.setIcon(R.drawable.ic_wechat);
        two.setIcon(R.drawable.ic_contact);
        three.setIcon(R.drawable.ic_discovery);
        four.setIcon(R.drawable.ic_mine);
    }

    private void initEvents() {
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == mTabLayout.getTabAt(0)) {
                    one.setIcon(R.drawable.ic_wechat_s);
                    mViewPager.setCurrentItem(0);
                } else if (tab == mTabLayout.getTabAt(1)) {
                    two.setIcon(R.drawable.ic_contact_s);
                    mViewPager.setCurrentItem(1);
                } else if (tab == mTabLayout.getTabAt(2)) {
                    three.setIcon(R.drawable.ic_discovery_s);
                    mViewPager.setCurrentItem(2);
                } else if (tab == mTabLayout.getTabAt(3)) {
                    four.setIcon(R.drawable.ic_mine_s);
                    mViewPager.setCurrentItem(3);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab == mTabLayout.getTabAt(0)) {
                    one.setIcon(R.drawable.ic_wechat);
                } else if (tab == mTabLayout.getTabAt(1)) {
                    two.setIcon(R.drawable.ic_contact);
                } else if (tab == mTabLayout.getTabAt(2)) {
                    three.setIcon(R.drawable.ic_discovery);
                }else if (tab == mTabLayout.getTabAt(3)){
                    four.setIcon(R.drawable.ic_mine);
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
