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

    @Test
    public void calculateDiscountTest() {

        double price = 100.0;
        int percentage = 100;

        assertEquals(100,DiscountCalculator.calculateDiscount(price, percentage));
    }

}
