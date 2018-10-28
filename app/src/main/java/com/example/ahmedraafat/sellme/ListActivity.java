package com.example.ahmedraafat.sellme;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    //ListView listView;
    Toolbar toolbar;

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        listView = findViewById(R.id.list_view);
//
//        ArrayList<Item> items = new ArrayList<>();
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item1","There is some information about item1"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item2","There is some information about item2"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item3","There is some information about item3"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item4","There is some information about item4"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item5","There is some information about item5"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item6","There is some information about item6"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item7","There is some information about item7"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item8","There is some information about item8"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item9","There is some information about item9"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item10","There is some information about item10"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item11","There is some information about item11"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item12","There is some information about item12"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item13","There is some information about item13"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item14","There is some information about item14"));
//        items.add(new Item(R.drawable.ic_launcher_foreground,"item15","There is some information about item15"));
//
//        ItemAdaptor adaptor = new ItemAdaptor(this,items);
//        listView.setAdapter(adaptor);


        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.pager);

        pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
