package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;
import java.text.SimpleDateFormat;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }



    public String getmDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String formattedDate = formatter.format(mDate);
        return formattedDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }




    public Crime(){
        //generates unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {
        return mId;
    }
}
