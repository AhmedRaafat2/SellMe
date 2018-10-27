package com.example.ahmedraafat.sellme;

import android.widget.ImageView;
import android.widget.TextView;

public class Item {

    private int imageId;
    private String itemTitle;
    private  String itemDescription;

    public Item(int imageId, String itemTitle, String itemDescription) {
        this.imageId = imageId;
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
    }

    public int getImageId() {
        return imageId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
