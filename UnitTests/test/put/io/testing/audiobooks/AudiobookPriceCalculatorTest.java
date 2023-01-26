package put.io.testing.audiobooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {

    private AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
    private Customer subscriber = new Customer("John", Customer.LoyaltyLevel.STANDARD, true);
    private Customer silver = new Customer("Mary", Customer.LoyaltyLevel.SILVER, false);
    private Customer gold = new Customer("Tom", Customer.LoyaltyLevel.GOLD, false);
    private Audiobook audiobook = new Audiobook("The Great Gatsby", 10.0);

    @Test
    public void testCalculateSubscriber() {
        double result = calculator.calculate(subscriber, audiobook);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testCalculateSilver() {
        double result = calculator.calculate(silver, audiobook);
        assertEquals(9.0, result, 0.0001);
    }

    @Test
    public void testCalculateGold() {
        double result = calculator.calculate(gold, audiobook);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testCalculateNormal() {
        double result = calculator.calculate(new Customer("Jessica", Customer.LoyaltyLevel.STANDARD, false), audiobook);
        assertEquals(10.0, result, 0.0001);
    }

}