
public class UnitTest {
              private final int[][] data = {
        {300, 150, 700},
        {250, 200, 600}
        };
              
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() () {
        int result = sales.TotalSales(data);

        assertEquals(2200, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        double result = sales.AverageSales(data);

        // doubles need a delta (the allowed rounding difference)
        assertEquals(366.67, result, 0.01);
}
