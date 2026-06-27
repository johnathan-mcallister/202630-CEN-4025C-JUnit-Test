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

    // Normal case
    @Test
    void testNormalDiscount() {
        double price = 100.0;
        int percentage = 25;

        assertEquals(75.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    // Edge case: 0% discount
    @Test
    void testZeroPercentDiscount() {
        double price = 100.0;
        int percentage = 0;

        assertEquals(100.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    // Edge case: 100% discount
    @Test
    void testFullDiscount() {
        double price = 100.0;
        int percentage = 100;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    // Invalid input: negative price
    @Test
    void testNegativePrice() {
        double price = -50.0;
        int percentage = 20;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

    // Invalid input: negative percentage
    @Test
    void testNegativePercentage() {
        double price = 100.0;
        int percentage = -10;

        assertEquals(0.0,
                DiscountCalculator.calculateDiscount(price, percentage));
    }

}
