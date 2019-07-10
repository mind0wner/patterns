package com.patterns.behavioral;

public class DecoratorDemo {
    public static void main(String[] args) {
        ChristmasTree tree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree.decorate());
    }
}