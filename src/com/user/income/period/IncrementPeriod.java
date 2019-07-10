package com.user.income.period;

public enum IncrementPeriod {

    QUATERLY(4),
    HALF_YEARLY(2),
    ANNUALLY(1);

    private int period;
    IncrementPeriod(int period) {
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public static IncrementPeriod getIncrementPeriod(int value) {
        for(IncrementPeriod incrementPeriod : IncrementPeriod.values()) {
            if(incrementPeriod.period == value){
                return incrementPeriod;
            }
        }
        return null;
    }
}
