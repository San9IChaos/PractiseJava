package com.company;

public class Main {

    public static void main(String[] args) {
	Elephant elephant = new Elephant();
	boolean isDangerous = elephant.isDangerous();
	if(elephant.canJump())
	    jump(elephant);

	Jumpable mouse;
	mouse = new Mouse();
	if(mouse.canJump())
	    jump(mouse);
    }

    public static void jump(Jumpable object){
        if(object.canJump()){}
    }
}
