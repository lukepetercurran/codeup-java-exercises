package Bord;

import Bord.Bird;

public class Duck extends Bird {
    // Bord.Duck inherits from Bord.Bird
    // Bord.Duck inherits all public methods
    // let's override
    //overrides makeNoise() from Bord.Bird()

    // when overridng you have to fulfill the protocol
    // the arguments must be the same, and return types compatible
    // if you change arguments or return types, you are overloading not overriding

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack Quack!");
    }
}
