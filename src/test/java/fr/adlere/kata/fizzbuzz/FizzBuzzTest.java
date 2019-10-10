package fr.adlere.kata.fizzbuzz;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final static String EXPECTED_RESULT_TO_100 = "1\r\n2\r\nFizz\r\n4\r\nBuzz\r\nFizz\r\n7\r\n8\r\nFizz\r\nBuzz\r\n11\r\nFizz\r\nFizz\r\n14\r\nFizzBuzz\r\n16\r\n17\r\nFizz\r\n19\r\nBuzz\r\nFizz\r\n22\r\nFizz\r\nFizz\r\nBuzz\r\n26\r\nFizz\r\n28\r\n29\r\nFizzBuzz\r\nFizz\r\nFizz\r\nFizz\r\nFizz\r\nFizzBuzz\r\nFizz\r\nFizz\r\nFizz\r\nFizz\r\nBuzz\r\n41\r\nFizz\r\nFizz\r\n44\r\nFizzBuzz\r\n46\r\n47\r\nFizz\r\n49\r\nBuzz\r\nFizzBuzz\r\nBuzz\r\nFizzBuzz\r\nFizzBuzz\r\nBuzz\r\nBuzz\r\nFizzBuzz\r\nBuzz\r\nBuzz\r\nFizzBuzz\r\n61\r\n62\r\nFizz\r\n64\r\nBuzz\r\nFizz\r\n67\r\n68\r\nFizz\r\nBuzz\r\n71\r\nFizz\r\nFizz\r\n74\r\nFizzBuzz\r\n76\r\n77\r\nFizz\r\n79\r\nBuzz\r\nFizz\r\n82\r\nFizz\r\nFizz\r\nBuzz\r\n86\r\nFizz\r\n88\r\n89\r\nFizzBuzz\r\n91\r\n92\r\nFizz\r\n94\r\nBuzz\r\nFizz\r\n97\r\n98\r\nFizz\r\nBuzz\r\n";

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @DisplayName("Test FizzBuzz Factory without args")
    @Test
    public void testCreateFizzBuzzWithNoArgs() {
        FizzBuzz fizzBuzz = FizzBuzz.createFizzBuzz();
        assertNotNull(fizzBuzz);
        assertEquals(fizzBuzz.getLimit(), 100);
    }

    @DisplayName("Test FizzBuzz Factory with args")
    @Test
    public void testCreateFizzBuzzWithArgs() {
        FizzBuzz fizzBuzz = FizzBuzz.createFizzBuzz();
        assertNotNull(fizzBuzz);
        assertEquals(fizzBuzz.getLimit(), 100);
    }

    @DisplayName("Test FizzBuzz count and print from 1 to 100")
    @Test
    public void testPrintFizzBuzz() {
        FizzBuzz fizzBuzz = FizzBuzz.createFizzBuzz();
        fizzBuzz.printFizzBuzz();
        assertEquals(EXPECTED_RESULT_TO_100, outContent.toString());
    }
}
