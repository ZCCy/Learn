package com.company;

public class Hero {
    @Deprecated
    /**
     * 标记过时的元素
     */
    public void say(){
        System.out.println("Nothing has to say");
    }

    public void speak(){
        System.out.println("I have a dream");
    }
}
