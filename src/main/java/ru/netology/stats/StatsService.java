package ru.netology.stats;

public class StatsService {

    public int getAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAverageSales(int[] sales) {
        int average = getAllSales(sales) / sales.length;

        return average;

    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMonthsBelowAverageSales(int[] sales) {
        int average = getAverageSales(sales);
        int minMonths = 0;
        for (int sale : sales) {
            if (sale < average) {
                minMonths++;
            }

        }
        return minMonths;


    }

    public int getMonthsAboveAverageSales(int[] sales) {
        int average = getAverageSales(sales);
        int maxMonths = 0;
        for (int sale : sales) {
            if (sale > average) {
                maxMonths++;
            }

        }
        return maxMonths;


    }

}






