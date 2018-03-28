package com.example.android.miwok;

/**
 * Created by wellcome on 3/23/2018.
 */

public class word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
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
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * +     * Create a new Word object.
     * +     *
     * +     * @param defaultTranslation is the word in a language that the user is already familiar with
     * +     *                           (such as English)
     * +     * @param miwokTranslation is the word in the Miwok language
     * +     * @param mImageResourceId is the drawable resource id for the image
     */


    public word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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

    /**
     * +     * Returns whether or not there is an image for this word.
     * +
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
