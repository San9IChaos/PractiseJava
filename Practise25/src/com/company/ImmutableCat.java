package com.company;

public class ImmutableCat {
    private String breed;
    private String eyeColor;

    ImmutableCat(String breed, String eyeColor){
        this.breed = breed;
        this.eyeColor = eyeColor;
        System.out.println("New cat is created! His breed is " + breed+" His Eye Color is " + eyeColor);
    }
    public ImmutableCat setBreed(String breed){
        ImmutableCat c = new ImmutableCat(breed, this.eyeColor);
        return c;
    }
    public ImmutableCat setEyeColor(String eyeColor){
        ImmutableCat c = new ImmutableCat(this.breed, eyeColor);
        return c;
    }
}
