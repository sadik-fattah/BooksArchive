package com.guercifzone.booksarchive.Models;

public class GridFeed {
    private String title;
    private int image_id;

    public GridFeed(String title, int image_id) {
        this.title = title;
        this.image_id = image_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
