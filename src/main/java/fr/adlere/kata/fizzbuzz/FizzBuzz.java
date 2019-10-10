package fr.adlere.kata.fizzbuzz;

import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 * Class containing the algorithm of the fizz fuzz kata
 */
public class FizzBuzz {
    private int limit;
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    /**
     * Create a fizz buzz instance and set the count limit to 100
     *
     * @return FizzBuzz instance
     */
    public static FizzBuzz createFizzBuzz() {
        return createFizzBuzz(100);
    }

    /**
     * Create a fizz buzz instance and set the param limit
     *
     * @param limit is the count limit
     * @return FizzBuzz instance
     */
    public static FizzBuzz createFizzBuzz(int limit) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setLimit(limit);
        return fizzBuzz;
    }

    /**
     * Print in the console the count from 1 to limit replacing :
     * - the multiple of 3 and the numbers containing 3 by Fizz
     * - the multiple of 5 and the numbers containing 5 by Buzz
     * - The multiple of 3 and 5 by FizzBuzz
     */
    public void printFizzBuzz() {
        IntStream.rangeClosed(1, limit)
                .mapToObj(counter ->
                        (isFizzBuzz(counter)) ? FIZZ + BUZZ : ((isFizz(counter)) ? FIZZ : (isBuzz(counter) ? BUZZ : counter))
                )
                .forEach(System.out::println);
    }

    private boolean isFizz(int currentNumber) {
        if (currentNumber % 3 == 0 || StringUtils.contains(String.valueOf(currentNumber), "3")) {
            return true;
        }
        return false;
    }

    private boolean isBuzz(int currentNumber) {
        if (currentNumber % 5 == 0 || StringUtils.contains(String.valueOf(currentNumber), "5")) {
            return true;
        }
        return false;
    }

    private boolean isFizzBuzz(int currentNumber) {
        if (this.isFizz(currentNumber) && this.isBuzz(currentNumber)) {
            return true;
        }
        return false;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
