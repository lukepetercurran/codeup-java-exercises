package KitchenApp;

// Abstract Class, highest on the hierarchy of classes
// Can serve as a superclass, but we cant directly instantiate an abstract class.

import java.sql.Ref;

public class ApplianceTest {
    public static void main(String[] args) {
//        // Will get an error by trying to directly instantiate an abstract class;
//        Appliance app1 = new Appliance();
        // This instantiation will work because we are referencing the Appliance class to instantiate a Refrigerator class
//        Appliance app1 = new Refrigerator("two door", "LG", true); //Appliances do not have the isHasIce boolean

        Refrigerator app1 = new Refrigerator("two door", "LG", true);


        System.out.println(app1.brandName);
        System.out.println(app1.type);


        // this keepFresh method will be the implementation we defined in the Refrigerator class.
        app1.keepFresh();

        IceChest ichest = new IceChest();

        // this keepFresh method will be the implementation we defined in the IceChest class.
        ichest.keepFresh();

        MiniFridge mini = new MiniFridge("one door", "LG");

        // this keepFresh method will be the implementation we defined in the MiniFridge class.
        mini.keepFresh();
        }
    }
