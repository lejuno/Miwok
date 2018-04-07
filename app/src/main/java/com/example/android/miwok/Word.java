/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.util.Log;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Word {
    private static String LOG_TAG = Word.class.getSimpleName();
    /**
     * Constant value that represents no resource was provided for this word
     */
    private static final int NO_RESOURCE_PROVIDED = -1;
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_RESOURCE_PROVIDED;


    /** Audio resource ID for the word */
    private int mAudioResourceId = NO_RESOURCE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        Log.v(LOG_TAG, "Word(" + defaultTranslation + ", " + miwokTranslation +
                ", " + audioResourceId + ")");
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        Log.v(LOG_TAG, "Word(" + defaultTranslation + ", " + miwokTranslation +
                ", " + imageResourceId + ", " + audioResourceId + ")");
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        Log.v(LOG_TAG, "getDefaultTranslation(" + mDefaultTranslation + ")");
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        Log.v(LOG_TAG, "getMiwokTranslation(" + mMiwokTranslation + ")");
        return mMiwokTranslation;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        Log.v(LOG_TAG, "getAudioResourceId(" + mAudioResourceId + ")");
        return mAudioResourceId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        Log.v(LOG_TAG, "getImageResourceId(" + mImageResourceId + ")");
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasAudio() {
        Log.v(LOG_TAG, "hasAudio(" +  (mAudioResourceId != NO_RESOURCE_PROVIDED) + ")");
        return mAudioResourceId != NO_RESOURCE_PROVIDED;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        Log.v(LOG_TAG, "hasImage(" +  (mImageResourceId != NO_RESOURCE_PROVIDED) + ")");
        return mImageResourceId != NO_RESOURCE_PROVIDED;
    }
}
