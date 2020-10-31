package com.shahnawazshaikh.tablayoutviewpagermodule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numTabs;
    PageAdapter(FragmentManager fm,int numTabs){
        super(fm);
        this.numTabs=numTabs;

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new cf();
            case 1:
                return new cc();
            case 2:
                return new at();
            case 3:
                return new lt();
            case 4:
                return new hk();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
