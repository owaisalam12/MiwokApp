package com.example.android.miwok;

/**
 * Created by Oways on 17-Dec-17.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID=imageCheck;
    private int mAudioResourceID;
    private static final int imageCheck=-1;
    public Word(String mDefaultTranslation, String mMiwokTranslation,int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID=mAudioResourceID;
    }

//    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID) {
//        this.mDefaultTranslation = mDefaultTranslation;
//        this.mMiwokTranslation = mMiwokTranslation;
//        this.mImageResourceID = mImageResourceID;
//
//    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
    public boolean hasImage(){
        return mImageResourceID !=imageCheck;
    }

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }
}
