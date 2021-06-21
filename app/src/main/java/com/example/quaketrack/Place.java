package com.example.quaketrack;

public class Place {
    private String mMagnitude;
    private String mDirection;
    private String mLocation;
    private String mDate;
    private String mTime;
    private String mUrl;

    public Place(String mMagnitude, String mDirection, String mLocation, String mDate, String mTime, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mDirection = mDirection;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mTime = mTime;
        this.mUrl = mUrl;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmDirection() {
        return mDirection;
    }

    public void setmDirection(String mDirection) {
        this.mDirection = mDirection;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
