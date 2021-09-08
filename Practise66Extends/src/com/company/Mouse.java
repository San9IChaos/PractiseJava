package com.company;

public class Mouse extends Animal implements Jumpable{
    boolean canJump = true;
    @Override
    public boolean canJump() {
        return canJump;
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    public Mouse() {
        super(5);
    }

    @Override
    protected int getWeight() {
        return 5;
    }

    @Override
    boolean isPredator() {
        return false;
    }
}
