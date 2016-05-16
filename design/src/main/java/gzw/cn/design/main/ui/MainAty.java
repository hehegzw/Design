package gzw.cn.design.main.ui;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import gzw.cn.design.R;
import gzw.cn.design.main.model.MainPagerAdapter;

public class MainAty extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener{
    private Toolbar toolbar;
    private Context context;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> list;
    private ViewGroup rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rootView = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.activity_main_aty,null);
        setContentView(R.layout.activity_main_aty);
        context = this;
        initToolBar();
        initView();
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tablelayout);
        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        MainPagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.setTabTextColors(Color.WHITE, Color.GRAY);//设置文本在选中和为选中时候的颜
        tabLayout = (TabLayout) findViewById(R.id.tablelayout);
//        tabLayout.addTab(tabLayout.newTab().setText("第一个"), true);//添加 Tab,默认选中
//        tabLayout.addTab(tabLayout.newTab().setText("第二个"),false);//添加 Tab,默认不选中
    }

    private void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("main");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
