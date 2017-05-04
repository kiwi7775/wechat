package com.example.wechat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wechat.fragment.ContactFragment;
import com.example.wechat.fragment.DiscoveryFragment;
import com.example.wechat.fragment.MineFragment;
import com.example.wechat.fragment.WeChatFragment;

/**
 * Created by Kiwi7 on 2017/5/4.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"微信", "通讯录", "发现", "我"};

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new ContactFragment();
        } else if (position == 2) {
            return new DiscoveryFragment();
        } else if (position == 3) {
            return new MineFragment();
        }
        return new WeChatFragment();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
