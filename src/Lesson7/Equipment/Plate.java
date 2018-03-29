package Lesson7.Equipment;

public class Plate {
    private double amountOfFood;

    public Plate(double amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public double getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(double amountOfFood) {
        this.amountOfFood = amountOfFood;
    }


    public void descreaseFood(double value) {
        amountOfFood-=value;
    }
}
