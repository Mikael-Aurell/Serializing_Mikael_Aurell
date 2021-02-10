package se.lexicon.model;

import java.io.Serializable;

public class Music implements Serializable {

    private int id;
    private String artist;
    private String title;

    public Music() {
    }

    public Music(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Music{" + "id=" + id + ", artist='" + artist + '\'' + ", title='" + title + '\'' + '}';
    }
}
