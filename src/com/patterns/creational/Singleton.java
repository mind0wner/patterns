package com.patterns.creational;


/**
 * Double Checked Locking & volatile
 * + Lazy initialization
 * + High performance
 */
public class Singleton {
    public static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}
