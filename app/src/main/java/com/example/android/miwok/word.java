package com.example.android.miwok;

/**
 * Created by wellcome on 3/23/2018.
 */

public class word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * +     * Create a new Word object.
     * +     *
     * +     * @param defaultTranslation is the word in a language that the user is already familiar with
     * +     *                           (such as English)
     * +     * @param miwokTranslation is the word in the Miwok language
     * +
     */
    public word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public word(String defaultTranslation, String miwokTranslation,int mImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /**
     * +     * Get the Miwok translation of the word.
     * +
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * +     * Get the default translation of the word.
     * +
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * +     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
