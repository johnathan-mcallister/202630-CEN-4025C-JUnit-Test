/**
 * Author: Johnathan McAllister (McAdmin)
 * Date: 2026-06-27
 * Course: CEN-4025C
 * Professor: Dr. Mary Walauskis
 *
 * Purpose:
 * - Applying a Discount to a Price
 *
 * Suggested Improvements:
 * - Determine whether negative prices represent valid scenarios (e.g., customer refunds) where discounts should not be applied.
 * - If a negative percentage is assumed to be a data-entry error, converting it to its absolute value could allow the intended discount to be applied.
 * - Define how discounts greater than 100% should be handled (e.g., cap the
 *   discount at 100%, reject the input, or allow it if the business logic
 *   supports promotional credits).
 */

public class DiscountCalculator {

    public static double calculateDiscount(double price, int percentage) {
        if (price <= 0 || (percentage < 0)) {
            return 0;
        }
        return price - (price * percentage / 100);
    }
}
