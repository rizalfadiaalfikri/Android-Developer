package com.rizalfadiaalfikri.a08_glidelibrary;

public class Model {

    String name, title, rank;
    int image;

    public Model(String name, String title, String rank, int image) {
        this.name = name;
        this.title = title;
        this.rank = rank;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
