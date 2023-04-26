/**
 * The Payable interface represents an entity that can be paid a certain amount of money.
 */
public interface Payable {
    /**
     * Gets the payment amount for this entity.
     *
     * @return The payment amount.
     */
    double getPaymentAmount();
}