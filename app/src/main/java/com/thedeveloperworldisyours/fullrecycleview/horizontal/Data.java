package com.thedeveloperworldisyours.fullrecycleview.horizontal;

/**
 * Created by javierg on 12/10/2016.
 */

public class Data {
    private String mTitle;
    private String mSubTitle;

    Data(String title, String subTitle){
        mTitle = title;
        mSubTitle = subTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public void setmSubTitle(String mSubTitle) {
        this.mSubTitle = mSubTitle;
    }
}
