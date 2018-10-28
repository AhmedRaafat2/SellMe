package com.example.ahmedraafat.sellme;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class FragmentOne extends Fragment {

    ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        //listView =

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.ic_launcher_foreground,"item1","There is some information about item1"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item2","There is some information about item2"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item3","There is some information about item3"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item4","There is some information about item4"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item5","There is some information about item5"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item6","There is some information about item6"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item7","There is some information about item7"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item8","There is some information about item8"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item9","There is some information about item9"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item10","There is some information about item10"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item11","There is some information about item11"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item12","There is some information about item12"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item13","There is some information about item13"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item14","There is some information about item14"));
        items.add(new Item(R.drawable.ic_launcher_foreground,"item15","There is some information about item15"));

        //ItemAdaptor adaptor = new ItemAdaptor(this,items);
        //listView.setAdapter(adaptor);


        return inflater.inflate(R.layout.fragment_one,container,false);
    }
}
