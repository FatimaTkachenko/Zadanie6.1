package ru.netology.stats;

public class StatsService {
    public long totalSale(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {
        return totalSale(sales) / 12;
    }

    public int monthMaximumSale(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        int monthMaximum = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        int monthMinimum = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
