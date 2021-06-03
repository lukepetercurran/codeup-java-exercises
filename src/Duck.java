public class Duck extends Bird {
    // Duck inherits from Bird
    // Duck inherits all public methods
    // let's override
    //overrides makeNoise() from Bird()

    // when overridng you have to fulfill the protocol
    // the arguments must be the same, and return types compatible
    // if you change arguments or return types, you are overloading not overriding

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack Quack!");
    }
}
