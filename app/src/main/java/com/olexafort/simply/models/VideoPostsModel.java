package com.olexafort.simply.models;

public class VideoPostsModel {

    private String video_post_url;
    private String video_likes_count;
    private String video_views_count;

    public VideoPostsModel(String video_post_url, String video_likes_count, String video_views_count) {
        this.video_post_url = video_post_url;
        this.video_likes_count = video_likes_count;
        this.video_views_count = video_views_count;
    }

    public VideoPostsModel() {
    }

    public String getVideo_post_url() {
        return video_post_url;
    }

    public void setVideo_post_url(String video_post_url) {
        this.video_post_url = video_post_url;
    }

    public String getVideo_likes_count() {
        return video_likes_count;
    }

    public void setVideo_likes_count(String video_likes_count) {
        this.video_likes_count = video_likes_count;
    }

    public String getVideo_views_count() {
        return video_views_count;
    }

    public void setVideo_views_count(String video_views_count) {
        this.video_views_count = video_views_count;
    }
}
