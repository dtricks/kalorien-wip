package com.fhdw.wip.wip.model;

import java.util.Date;

/**
 * Created by denis on 15.10.17.
 */

public class DiaryEntry {
    private Amount amount;
    private Date dateTime;
    private Meal meal;

    public DiaryEntry(Amount amount, Date dateTime, Meal meal) {
        this.amount = amount;
        this.dateTime = dateTime;
        this.meal = meal;
    }

    public void toJSON(){/*TODO*/}

    @Override
    public String toString() {
        return "DiaryEntry{" +
                "amount=" + amount +
                ", dateTime=" + dateTime +
                ", meal=" + meal +
                '}';
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
