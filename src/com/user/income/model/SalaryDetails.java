package com.user.income.model;

import com.user.income.period.IncrementPeriod;

public class SalaryDetails {

    private double starting_salary;
    private double increment;
    private double deduct;
    private IncrementPeriod increment_frequency;
    private IncrementPeriod deduct_frequency;
    private int years;

    public double getStarting_salary() {
        return starting_salary;
    }

    public void setStarting_salary(double starting_salary) {
        this.starting_salary = starting_salary;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public double getDeduct() {
        return deduct;
    }

    public void setDeduct(double deduct) {
        this.deduct = deduct;
    }

    public IncrementPeriod getIncrement_frequency() {
        return increment_frequency;
    }

    public void setIncrement_frequency(IncrementPeriod increment_frequency) {
        this.increment_frequency = increment_frequency;
    }

    public IncrementPeriod getDeduct_frequency() {
        return deduct_frequency;
    }

    public void setDeduct_frequency(IncrementPeriod deduct_frequency) {
        this.deduct_frequency = deduct_frequency;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
