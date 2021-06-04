package KitchenApp;

// Abstract Class, highest on the hierarchy of classes
// Can serve as a superclass, but we cant directly instantiate an abstract class.

import java.sql.Ref;

public class ApplianceTest {
    public static void main(String[] args) {
//        // Will get an error bhy tring to directly instantiate an abstract class;
//        Appliance app1 = new Appliance();

//        Appliance app1 = new Refrigerator("two door", "LG", true); //Appliances do not have the isHasIce boolean

        Refrigerator app1 = new Refrigerator("two door", "LG", true);


        System.out.println(app1.brandName);
        System.out.println(app1.type);
        System.out.println(app1.isHasIce());
        app1.keepFresh();
        }
    }
