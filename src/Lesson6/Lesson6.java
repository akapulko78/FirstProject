package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Animal dog1 = new Dog(400,5,1);
        Animal dog2 = new Dog(600,15,3);
        Animal cat1 = new Cat(200, 2);
        Animal cat2 = new Cat(300, 3);

        dog1.animalRunning(300);
        dog1.animalSwimming(11);
        dog1.animalJumping(0.1);

        dog2.animalRunning(700);
        dog2.animalSwimming(8);
        dog2.animalJumping(2);

        cat1.animalRunning(190);
        cat1.animalSwimming(2);
        cat1.animalJumping(1);

        cat2.animalRunning(400);
        cat2.animalSwimming(3);
        cat2.animalJumping(4);
    }

}
