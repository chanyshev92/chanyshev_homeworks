package ru.pcs;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName(value = "NumbersUtil is working when")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class NumbersUtilTest {
    private final NumbersUtil numbersUtil = new NumbersUtil();

    @Nested
    @DisplayName("gcd() is working")
    public class ForGcd {
        @ParameterizedTest(name = "return {2} on {0} and {1}")
        @CsvSource(value = {"5,5,5", "10,5,5", "0,0,0", "1,0,1", "0,10,10"})
        public void return_correct_gcd(int a, int b, int result) {
            assertEquals(result, numbersUtil.gcd(a, b));
        }

        @ParameterizedTest(name = "throws exception on {0} or {1}")
        @CsvSource(value = {"-5,5", "5,-5", "-5,-5"})
        public void bad_numbers_throws_exception(int a, int b) {
            assertThrows(IllegalArgumentException.class, () -> numbersUtil.gcd(a, b));
        }
    }
}
