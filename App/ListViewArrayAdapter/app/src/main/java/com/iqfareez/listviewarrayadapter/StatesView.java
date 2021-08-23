package com.iqfareez.listviewarrayadapter;

public class StatesView
{
    private final int ivNumbersImageId;
    private final String mStatesName;
    private final String mStatesTitle;

    public StatesView(int NumbersImageId, String StateName, String StatesTitle){
        ivNumbersImageId = NumbersImageId;
        mStatesName = StateName;
        mStatesTitle = StatesTitle;
    }

    public int getNumberImageId(){
        return ivNumbersImageId;
    }

    public String getStatesName(){
        return mStatesName;
    }

    public String getStatesTitle(){
        return mStatesTitle;
    }
}
