import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumForTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateSum(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageForSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverage(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSalesTheMonthOfMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSalesTheMonthOfMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldUnderAverageCountMounthsUnderAverange() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.underAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveAverageCountMounthsAboveAverange() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}




