package com.example.myapplication5;

public class Fruit {
    private String name;
    private int imageId;

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Fruit(String fruitName, int fruitImage)
    {
        this.name=fruitName;
        this.imageId=fruitImage;
    }
    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }


}
