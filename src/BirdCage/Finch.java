package BirdCage;

public class Finch extends Bird {
// inherits makeNoise() from BirdCage.Bird()
public void makeNoise() {
    super.makeNoise();
    System.out.println("Tweet tweet!");
}
    public Finch(){
        super();
        System.out.println("A Finch just got created");
    }

    public Finch(String name, boolean canItFly){
        this.setName(name);
        this.setCanFly(canItFly);
    }
}

