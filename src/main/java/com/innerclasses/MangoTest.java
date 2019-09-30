package com.innerclasses;

public class MangoTest {

    public static void main(String[] args) {
        Mango mango = new Mango () {
            @Override
            public void taste() {
                System.out.println ("Mango taste is Good");
            }
        };
        mango.taste ();
    }
}
