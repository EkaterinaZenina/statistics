package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int AvgMinMonth(int[] sales) {
        int AvgMinMonth = 0;
        int avg = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avg) {
                AvgMinMonth = AvgMinMonth + 1;
            }
        }
        return AvgMinMonth;
    }

    public int AvgMaxMonth(int[] sales) {
        int AvgMaxMonth = 0;
        int avg = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avg) {
                AvgMaxMonth = AvgMaxMonth + 1;
            }
        }
        return AvgMaxMonth;
    }

}

