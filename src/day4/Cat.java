package day4;

public class Cat {

    String name;
    int age;
    String color;
    String breed;

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void play(){
        System.out.println("Playing");
    }

    public void feed(){
        System.out.println("Eating");
    }

    public static void main(String[] args) {

        Cat thor = new Cat();
        Cat rambo = new Cat();


        thor.name = "Thor";
        thor.age = 2;
        thor.color = "black";
        thor.breed = "A";

        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "grey";
        rambo.breed = "B";

        thor.sleep();
        rambo.play();

    }
}
