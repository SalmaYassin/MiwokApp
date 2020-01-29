package com.example.android.miwok;

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1 ;
    private int audioResourceId ;

    public Word( String defaultTranslation,String miwokTranslation, int audioResourceId  ) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioResourceId = audioResourceId ;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId , int audioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId ;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage () {
        return imageResourceId != NO_IMAGE_PROVIDED ;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
