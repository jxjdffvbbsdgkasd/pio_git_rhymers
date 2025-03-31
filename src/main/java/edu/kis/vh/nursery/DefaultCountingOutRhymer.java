package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

    /**
     * The constant INT.
     */
    public static final int INT = 12;
    /**
     * The constant INT1.
     */
    public static final int INT1 = -1;
    /**
     * The constant INT2.
     */
    public static final int INT2 = 11;
    private int[] numbers = new int[INT];

    private int total = INT1;

    /**
     * Gets total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Count in.
     *
     * @param in the in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Call check boolean.
     *
     * @return the boolean
     */
    public boolean callCheck() {
        return total == INT1;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == INT2;
    }

    /**
     * Peekaboo int.
     *
     * @return the int
     */
    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return numbers[total];
    }

    /**
     * Count out int.
     *
     * @return the int
     */
    public int countOut() {
        if (callCheck())
            return INT1;
        return numbers[total--];
    }

}
