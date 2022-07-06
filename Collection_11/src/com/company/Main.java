package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(9);
        stack.push(7);
        stack.push(10);
        stack.push(3);

while(!stack.isEmpty()) {
    System.out.println(stack.pop());
}
    }
}
