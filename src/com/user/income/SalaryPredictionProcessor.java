package com.user.income;

import com.user.income.model.SalaryDetails;

import java.util.ArrayList;
import java.util.List;

class SalaryPredictionProcessor {

    public void salaryIncrementCalculator(SalaryDetails salary) {

        int yearCount = 1;
        double totalIncrement = 0;
        List<PredictionReport> predictionReport = new ArrayList<>();

        while (yearCount <= salary.getYears()) {

            PredictionReport report = new PredictionReport();
            report.setYears(yearCount);
            report.setStarting_salary(calculateStartingSalary(salary, yearCount, totalIncrement));
            report.setIncrement(salary.getIncrement());
            report.setIncrementFrequency(salary.getIncrement_frequency().getPeriod());
            totalIncrement = calculateStartingSalary(salary, yearCount, totalIncrement) + salary.getIncrement() * salary.getIncrement_frequency().getPeriod();
            report.setTotalIncrement(totalIncrement);
            predictionReport.add(report);
            yearCount++;
        }
        System.out.println("\nINCREMENT REPORT");
        System.out.println("Year\tStarting salary\t\tNumber of increments\tIncrement %\t\tIncrement amount");
        predictionReport.stream().forEach(el -> System.out.println(el.incrementalReport()));
    }


    private double calculateStartingSalary(SalaryDetails salary, int yearCount, double totalIncrement) {
        return yearCount == 1 ? salary.getStarting_salary() : totalIncrement;
    }
}
