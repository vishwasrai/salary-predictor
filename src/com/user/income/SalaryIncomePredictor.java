package com.user.income;

import com.user.income.model.SalaryDetails;
import com.user.income.period.IncrementPeriod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryIncomePredictor {

    public static void main(String[] args) throws IOException {

        SalaryDetails salaryDetails = new SalaryDetails();
        SalaryPredictionProcessor processor = new SalaryPredictionProcessor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Enter starting salary(Should be +ve number):");
            salaryDetails.setStarting_salary(Integer.parseInt(reader.readLine()));
        } while (salaryDetails.getStarting_salary() < 1);

        do {
            System.out.print("Enter increment to be received in percent(Should be +ve number):");
            salaryDetails.setIncrement(Integer.parseInt(reader.readLine()));
        } while (salaryDetails.getIncrement() < 0);

        do {
            System.out.print("Frequency of increment received(Should be 4-> quarterly, 2 -> half-yearly or 1-> annually):");
            salaryDetails.setIncrement_frequency(IncrementPeriod.getIncrementPeriod(Integer.parseInt(reader.readLine())));
        } while (salaryDetails.getIncrement_frequency()== null);

        do {
            System.out.print("Enter deduction on income in percent(Should be +ve number):");
            salaryDetails.setDeduct(Integer.parseInt(reader.readLine()));
        } while (salaryDetails.getDeduct() < 0);

        do {
            System.out.print("Frequency of deductions done(Should be 4-> quarterly, 2 -> half-yearly or 1-> annually):");
            salaryDetails.setDeduct_frequency(IncrementPeriod.getIncrementPeriod(Integer.parseInt(reader.readLine())));
        } while (salaryDetails.getDeduct_frequency()== null);

        do {
            System.out.print("Prediction for years(Should be +ve number):");
            salaryDetails.setYears(Integer.parseInt(reader.readLine()));
        } while (salaryDetails.getYears() < 0);

        processor.salaryIncrementCalculator(salaryDetails);
        processor.salaryDecrementCalculator(salaryDetails);
        processor.salaryPredictionCalculator(salaryDetails);
    }
}
