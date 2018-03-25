package Lesson6;

public class Dog extends Animal {
    private int maxSwimmingDistance;

    public Dog(int maxRunningDistance, int maxSwimmingDistance, double maxJumpingDistance) {
        super(maxRunningDistance, maxJumpingDistance);
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    @Override
    boolean swim(int distance) {
        return distance >= 0 && distance <= maxSwimmingDistance;

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
