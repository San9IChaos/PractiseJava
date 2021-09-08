package com.company;

public class Elephant extends Animal implements Jumpable{
    private boolean canJump = false;
public Elephant(){
    super(200);
}
    public boolean isPredator(){
    return false;
}
    public boolean canJump() {
        return canJump;
    }
}
