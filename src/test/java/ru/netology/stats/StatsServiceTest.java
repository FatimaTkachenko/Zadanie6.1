package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testTotalSun() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.totalSale(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSun() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMonthMaximum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaximumSale(sales);
        long expected = 8; // последний месяц с максимальной продажей (20 в 6-м и 8-м месяцах)

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBellowAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthBellowAverage(sales);
        long expected = 5; // последний месяц с максимальной продажей (20 в 6-м и 8-м месяцах)

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMonthHigherAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthHigherAverage(sales);
        long expected = 5; // последний месяц с максимальной продажей (20 в 6-м и 8-м месяцах)

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinimum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinimumSale(sales);
        long expected = 9; // месяц с минимальной продажей (7 в 9-м месяце)

        Assertions.assertEquals(expected, actual);
    }
}