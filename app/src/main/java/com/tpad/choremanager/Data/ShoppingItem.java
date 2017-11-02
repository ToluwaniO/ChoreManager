package com.tpad.choremanager.Data;

/**
 * Created by oguns on 11/2/2017.
 */

public class ShoppingItem {
    private int type;
    private String name;

    public ShoppingItem() {
    }

    public ShoppingItem(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
