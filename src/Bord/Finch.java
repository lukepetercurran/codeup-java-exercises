package Bord;

import Bord.Bird;

public class Finch extends Bird {
// inherits makeNoise() from Bord.Bird()
public void makeNoise(){
    super.makeNoise();
    System.out.println("Tweet tweet!");
}
}
