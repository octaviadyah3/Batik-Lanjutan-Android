package com.dyahexample.myloginapp.data.favorite;

public class FavoriteData {

    private String item_name;
    private String key_id;
    private int item_image;

    public FavoriteData(){

    }

    public FavoriteData(String item_name, String key_id, int item_image){
        this.item_name = item_name;
        this.item_image = item_image;
        this.key_id = key_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }
}
