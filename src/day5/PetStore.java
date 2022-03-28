package day5;

public class PetStore {

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
