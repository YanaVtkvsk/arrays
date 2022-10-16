package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldFindAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void ShouldFindAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.getAverageSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test
    public void ShouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void ShouldFindMinDay() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void ShouldFindMinMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonths = 5;
        int actualMinMonths = service.getMonthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedMinMonths, actualMinMonths);
    }

    @Test
    public void ShouldFindMaxMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonths = 5;
        int actualMaxMonths = service.getMonthsAboveAverageSales(sales);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);

    }
}
