package Bord;

import Bord.Bird;

public class BirdTest {
    public static void main(String[] args) {
//        Bord.Bird cardinal = new Bord.Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

        Duck mallard                            =                    new Duck();
        //declare a reference variable       assigned          call the default constructor
        mallard.setName("Mallard");
        mallard.makeNoise();
//
//
        Finch lesserGoldfinch = new Finch();
        lesserGoldfinch.setName("Lesser Goldfinch");
        lesserGoldfinch.makeNoise();

        Penguin penguin = new Penguin();
        penguin.setName("Emperor Bord.Penguin");
        penguin.setCanFly(false);
        penguin.move();
        penguin.makeNoise();


        //Polymorphism allows us to have different reference and object types
//        Bord.Bird myPenguin;

        Finch houseFinch = new Finch();
        Bird piratesBestFriend = new Bird();
        System.out.println(piratesBestFriend.getName());
    }

}
