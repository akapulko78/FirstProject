package Lesson7.Animals;

public class Cat extends Animal {



    public Cat(int maxRunningDistance, double maxJumpingDistance, boolean fullness, double enoughFood) {
        super(maxRunningDistance, maxJumpingDistance);
        this.fullness = fullness;
        this.enoughFood = enoughFood;
    }


    @Override
    boolean swim(int distance) {
        return false;
    }

    @Override
    boolean run(int distance) {
        return distance >= 0 && distance <= maxRunningDistance;
    }

    @Override
    boolean jump(double height) {
        return height >= 0 && height <= maxJumpingDistance;
    }


}
