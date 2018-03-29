package Lesson7.Animals;


import Lesson7.Equipment.Plate;

public abstract class Animal {
    protected final int maxRunningDistance;

    protected final double maxJumpingDistance;

    public double getEnoughFood() {
        return enoughFood;
    }

    protected double enoughFood;

    protected boolean fullness;

    public Animal(int maxRunningDistance, double maxJumpingDistance) {
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingDistance = maxJumpingDistance;
    }
    abstract boolean swim(int distance);

    abstract boolean run(int distance);

    abstract boolean jump(double height);

    public boolean eat(Plate plate){
        if (plate.getAmountOfFood()< enoughFood)
        return  false;
        else
            plate.descreaseFood(enoughFood);
        return true;
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
