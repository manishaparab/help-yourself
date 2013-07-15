package com.example.helpyourself;

import android.graphics.Bitmap;

public class AppInfo {
    private Bitmap mIcon;
    private String mName;
 
    public AppInfo(Bitmap icon, String name) {
        mIcon = icon;
        mName = name;
    }
 
    public void setIcon(Bitmap icon) {
        mIcon = icon;
    }
    public Bitmap getIcon() {
        return mIcon;
    }
 
    public void setName(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
 
}