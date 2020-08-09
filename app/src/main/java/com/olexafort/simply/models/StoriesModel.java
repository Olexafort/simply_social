package com.olexafort.simply.models;

public class StoriesModel {

    private String story_photo_url;

    public StoriesModel(String story_photo_url) {
        this.story_photo_url = story_photo_url;
    }

    public StoriesModel() {
    }

    public String getStory_photo_url() {
        return story_photo_url;
    }

    public void setStory_photo_url(String story_photo_url) {
        this.story_photo_url = story_photo_url;
    }
}
