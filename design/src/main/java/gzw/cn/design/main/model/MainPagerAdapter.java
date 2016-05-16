package gzw.cn.design.main.model;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by gzw on 2016/5/16.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragments;

    public MainPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "one";
            case 1:
                return "two";
            case 2:
                break;
            case 3:
                break;
        }
        return super.getPageTitle(position);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
