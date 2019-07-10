package com.user.income;

public class PredictionReport {

    private double starting_salary;
    private double increment;
    private double deduct;
    private int incrementFrequency;
    private int deductFrequency;
    private int years;
    private double totalIncrement;
    private double totalDecrement;
    private double salaryGrowth;

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

    public int getIncrementFrequency() {
        return incrementFrequency;
    }

    public void setIncrementFrequency(int incrementFrequency) {
        this.incrementFrequency = incrementFrequency;
    }

    public int getDeductFrequency() {
        return deductFrequency;
    }

    public void setDeductFrequency(int deductFrequency) {
        this.deductFrequency = deductFrequency;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getTotalIncrement() {
        return totalIncrement;
    }

    public void setTotalIncrement(double totalIncrement) {
        this.totalIncrement = totalIncrement;
    }

    public double getTotalDecrement() {
        return totalDecrement;
    }

    public void setTotalDecrement(double totalDecrement) {
        this.totalDecrement = totalDecrement;
    }

    public double getSalaryGrowth() {
        return salaryGrowth;
    }

    public void setSalaryGrowth(double salaryGrowth) {
        this.salaryGrowth = salaryGrowth;
    }

    public String incrementalReport() {
        return years + "\t\t\t" + starting_salary + "\t\t\t\t" + incrementFrequency + "\t\t\t\t\t\t" + increment + "\t\t\t\t" + totalIncrement;
    }
}
