package com.fhdw.wip.wip.model;

import java.util.Map;

/**
 * Created by denis on 15.10.17.
 */

public class Food extends Meal {
    private String name;
    private float kcal;
    private Amount amount;

    public Food(String name, float kcal, Amount amount) {
        this.name = name;
        this.kcal = kcal;
        this.amount = amount;
    }

    public void toJSON(){/*TODO*/}

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", kcal=" + kcal +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getKcal() {
        return kcal;
    }

    public void setKcal(float kcal) {
        this.kcal = kcal;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
