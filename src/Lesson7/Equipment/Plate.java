package Lesson7.Equipment;

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
'// FIXME: 29.03.2018 '
   // public void putMoreFood(Plate plate){
   //     setAmountOfFood(getEnoughFood - plate);
//

    public void descreaseFood(double value) {
        amountOfFood -= value;
    }
}
