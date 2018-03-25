package Lesson6;

public abstract class Animal {
    protected final int maxRunningDistance;

    protected final double maxJumpingDistance;

    public Animal(int maxRunningDistance, double maxJumpingDistance) {
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingDistance = maxJumpingDistance;
    }
    abstract boolean swim(int distance);

    abstract boolean run(int distance);

    abstract boolean jump(double height);

    void animalRunning(int distance) {
        System.out.println("run: " + run(distance));
    }
    void animalSwimming(int distance){
        System.out.println("swim: " + swim(distance));
    }
    void animalJumping(double height){
        System.out.println("jump: " + jump(height));
    }

}
