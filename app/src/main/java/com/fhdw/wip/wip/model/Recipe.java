package com.fhdw.wip.wip.model;

import java.util.Map;

/**
 * Created by denis on 15.10.17.
 */

public class Recipe extends Meal {

    private Map<Food, Amount> foodAmount;
    private String name;

    public Recipe(Map<Food, Amount> foodAmount, String name) {
        this.foodAmount = foodAmount;
        this.name = name;
    }

    public void addFood(Food food, Amount amount){/*TODO*/}

    public void deleteFood(String name){/*TODO*/}

    public float calculateTotalKcal(Map<Food, Amount> foodAmount){
        /*TODO*/
        float kcal=0;
        return kcal;
    }

    public float calculateTotalKcal(){
        return calculateTotalKcal(this.foodAmount);
    }

    public void toJSON(){/*TODO*/}

    public Map<Food, Amount> getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(Map<Food, Amount> foodAmount) {
        this.foodAmount = foodAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
