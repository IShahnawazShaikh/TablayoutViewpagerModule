package com.shahnawazshaikh.tablayoutviewpagermodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
  TabLayout tabLayout;
  TabItem cf,cc,at,lt,hk;
  ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.Tablayouts);
        cf=findViewById(R.id.cf);
        cc=findViewById(R.id.cc);
        at=findViewById(R.id.at);
        lt=findViewById(R.id.lt);
        hk=findViewById(R.id.hk);
         viewPager=findViewById(R.id.pager);

         PageAdapter adapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

         viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
         tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {
                 viewPager.setCurrentItem(tab.getPosition());
             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });




    }
}