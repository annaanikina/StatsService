package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long monthSales : sales) {
            sum += monthSales;
        }
        return sum;

    }

    public long calculateAverage(long[] sales) {
        long sum = calculateSum(sales);
        long average = sum / 12;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long monthSale : sales) {
            if (monthSale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long monthSale : sales) {
            if (monthSale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) {
        long average = calculateAverage(sales);
        int countMonUnderAve = 0;
        for (long monthSale : sales) {
            if (monthSale < average) {
                countMonUnderAve++;
            }
        }
        return countMonUnderAve++;
    }

    public int aboveAverage(long[] sales) {
        long average = calculateAverage(sales);
        int countMonAboveAve = 0;
        for (long monthSale : sales) {
            if (monthSale > average) {
                countMonAboveAve++;
            }
        }
        return countMonAboveAve++;
    }
}

