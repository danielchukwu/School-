package com.designpatterns;

public class Singleton {
    private static Singleton instance;
    public String name;

    private Singleton(){
        this.name = "new Singleton()";
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
