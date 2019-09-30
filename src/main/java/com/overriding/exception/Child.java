package com.overriding.exception;

import java.io.FileNotFoundException;

public class Child extends Parent {
    public void m1()throws FileNotFoundException,InterruptedException {
        throw new FileNotFoundException("file not found");
    }
}
