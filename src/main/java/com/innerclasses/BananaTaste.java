package com.innerclasses;

public class BananaTaste {
    public void eat(Banana banana){
        System.out.println ("Eating Banana");
    }

    public static void main(String[] args) {
        BananaTaste bananaTaste= new BananaTaste ();
        bananaTaste.eat ( new Banana () {
            @Override
            public void taste() {

            }
        } );
    }

}
