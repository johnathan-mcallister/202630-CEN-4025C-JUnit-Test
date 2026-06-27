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

public class DiscountCalculator {

    public static double calculateDiscount(double price, int percentage) {
        if (price <= 0 || percentage < 0) {
            return 0;
        }
        return price - (price * percentage / 100);
    }
}
