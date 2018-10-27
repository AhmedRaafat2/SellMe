package com.example.ahmedraafat.sellme;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdaptor extends ArrayAdapter<Item> {
    ImageView imageView;
    TextView item_title;
    TextView item_desc;
    public ItemAdaptor(@NonNull Context context, @NonNull ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);
        imageView = convertView.findViewById(R.id.item_image);
        item_title = convertView.findViewById(R.id.item_title);
        item_desc = convertView.findViewById(R.id.item_desc);

        Item item = getItem(position);
        imageView.setImageResource(item.getImageId());
        item_title.setText(item.getItemTitle());
        item_desc.setText(item.getItemDescription());

        return convertView;
    }
}
