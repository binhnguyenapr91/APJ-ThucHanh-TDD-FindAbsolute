import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    void findAbsoluteWithZero() {
        int input = 0;
        int expected = 0;
        int real = AbsoluteNumber.findAbsolute(input);
        assertEquals(expected, real);
    }

    @Test
    void findAbsoluteWithNegative() {
        int input = -1;
        int expected = 1;
        int real = AbsoluteNumber.findAbsolute(input);
        assertEquals(expected, real);
    }

    @Test
    void findAbsoluteWithPositive() {
        int input = 1;
        int expected = 1;
        int real = AbsoluteNumber.findAbsolute(input);
        assertEquals(expected, real);
    }
}