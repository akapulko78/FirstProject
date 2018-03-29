package Lesson7.Animals;


import Lesson7.Equipment.Plate;

public abstract class Animal {
    protected final int maxRunningDistance;

    protected final double maxJumpingDistance;

    protected double value;

    public Animal(int maxRunningDistance, double maxJumpingDistance) {
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingDistance = maxJumpingDistance;
    }
    abstract boolean swim(int distance);

    abstract boolean run(int distance);

    abstract boolean jump(double height);

    protected boolean eat (Plate plate){
        if (plate.getAmountOfFood()<value)
        return  false;
        else
            plate.descreaseFood(value);
    }

    public void animalRunning(int distance) {
        System.out.println("run: " + run(distance));
    }
    public void animalSwimming(int distance){
        System.out.println("swim: " + swim(distance));
    }
    public void animalJumping(double height){
        System.out.println("jump: " + jump(height));
    }

}
