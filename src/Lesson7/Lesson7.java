package Lesson7;


import Lesson7.Animals.Animal;
import Lesson7.Animals.Cat;
import Lesson7.Animals.Dog;
import Lesson7.Equipment.Plate;

public class Lesson7 {
        public static void main(String[] args) {
            Animal dog1 = new Dog(400,5,1);
            Animal dog2 = new Dog(600,15,3);
            Animal cat1 = new Cat(200, 2, false, 15);
            Animal cat2 = new Cat(300, 3, false, 20);

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

            Cat[] cat = new Cat[5];
            cat[0] = new Cat(100,1,false,5);
            cat[1] = new Cat(200,2,false,10);
            cat[2] = new Cat(300,3,false,15);
            cat[3] = new Cat(400,4,false,20);
            cat[4] = new Cat(500,5,false,25);
            Plate plate = new Plate(50);

            for (int i = 0; i <cat.length ; i++) {
                System.out.println(cat[i].eat(plate));
            }

        }
}
