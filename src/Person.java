import org.w3c.dom.ls.LSOutput;

// Object Basics
public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello there, " + name + "!");
    }
//TODO: the class should have a constructor that accepts a 'string' value and sets the person's name to the passed string
    public Person(String name){
        this.name = name;
    }

//// Understanding references
    public static void main(String[] args) {
        Person personOne = new Person("Bill");
        Person personTwo = personOne;
        System.out.println(personOne.getName());
        System.out.println(personTwo.getName());
        personTwo.setName("Ted");
        System.out.println(personOne.getName());
        System.out.println(personTwo.getName());
    }

//    public static void main(String[] args){
//        //testing constructor
//        Person p = new Person("Rudy");
//        // should see rudy as a name
//        System.out.println(p.getName());
//        p.setName("Rudolph");
//        // should see Rudolph as a name.
//        System.out.println(p.getName());
//        // should see "Hello there Rudolph"
//        p.sayHello();

//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    // guess is true?
//    System.out.println(person1.getName().equals(person2.getName()));
//    // guess is false?
//    System.out.println(person1 == person2);
//
//    System.out.println(person1);
//    System.out.println(person2);
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    //expect true
//    System.out.println(person1 == person2);
//
//    System.out.println(person1);
//    System.out.println(person2);
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1.getName);
//    System.out.println(person2.getName);
//    person2.setName("Jane");
//    System.out.println(person1.getName);
//    System.out.println(person2.getName);
//
//    System.out.println(person1);
//    System.out.println(person2);




}
}
