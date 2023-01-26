package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    @Test
    public void test1() {
        assertTrue(false);
    }

    @Test
    public void test2() {
        throw new RuntimeException();
    }

    @Test
    public void test3() {
        try {
            assertTrue(false);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

}