package Lesson7.Equipment;

import Lesson7.Animals.Animal;
import Lesson7.Animals.Cat;
import javafx.fxml.FXML;

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


    public void descreaseFood(double enoughFood) {
        amountOfFood -= enoughFood;
    }

    public void putMoreFood(double enoughFood) {
        setAmountOfFood(enoughFood);
    }
}
