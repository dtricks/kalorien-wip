package com.fhdw.wip.wip.model;

/**
 * Created by denis on 15.10.17.
 */

public class Amount extends Unit {
    private float amount;

    public Amount(String abbreviation, String name, float amount) {
        super(abbreviation, name);
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
