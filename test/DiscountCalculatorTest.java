/**
 * Author: Johnathan McAllister (McAdmin)
 * Date: 2026-06-27
 * Course:
 * Professor:
 * <p>
 * Purpose:
 * -
 * <p>
 * Constraints:
 * -
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiscountCalculatorTest {

    /**
     * Normal Case
     *
     * Purpose:
     * - Demonstrates that a standard discount is correctly applied to an item's price
     *
     * Expected Result:
     * - Percent: 25%
     * - Price: $100.00
     * - Final Price = $75.00
    */
    @Test
    void testNormalDiscount() {
        double price = 100.0;
        int percentage = 25;

        assertEquals(75.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    /**
     * Edge case
     *
     * Purpose:
     * - Demonstrates that a 0% discount is correctly applied to an items price
     *
     * Expected Result:
     * - Percent = 0%
     * - Price = $100.00
     * - Final Price = $100.00
     */
    @Test
    void testZeroPercentDiscount() {
        double price = 100.0;
        int percentage = 0;

        assertEquals(100.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    /**
     * Edge case
     *
     * Purpose:
     * - Demonstrates that a full discount is correctly applied to an items price
     *
     * Expected Result:
     * - Percent = 100%
     * - Price = $100
     * - Final Price = $0.00
     */
    @Test
    void testFullDiscount() {
        double price = 100.0;
        int percentage = 100;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    /**
     * Edge case
     *
     * Purpose:
     * - Demonstrates that a non-standard discount is still applied to an items price
     *
     * Expected Result:
     * - Percent = 150%
     * - Price = $100.00
     * - Final Price = -$50.00
     */
    @Test
    void testOverDiscount() {
        double price = 100.0;
        int percentage = 150;

        assertEquals(-50.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    /**
     * Invalid Input case
     *
     * Purpose:
     * - Demonstrates that a standard discount is not applied to an item with a negative price, and instead returns a price of $0.00
     *
     * Expected Result:
     * - Percent = %20
     * - Price = -$50.00
     * - Final Price = $0.00
     */
    @Test
    void testNegativePrice() {
        double price = -50.0;
        int percentage = 20;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    /**
     * Invalid Input case
     *
     * Purpose:
     * - Demonstrates that a negative discount is not applied to an items price, and instead returns a price of $0.00
     *
     * Expected Result:
     * - Percentage = -10%
     * - Price = $100.00
     * - Final price of $0.00
     */
    @Test
    void testNegativePercentage() {
        double price = 100.0;
        int percentage = -10;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

}
