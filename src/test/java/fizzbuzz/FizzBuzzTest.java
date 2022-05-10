package fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz game;
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final int MAX_NUMBERS = 100;

    @Before
    public void before() {
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5() {
        List<String> numbersList = game.getNumbers(MAX_NUMBERS);

        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("7", numbersList.get(6));
        Assert.assertEquals("13", numbersList.get(12));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf3() {
        List<String> numbersList = game.getNumbers(MAX_NUMBERS);

        String key_word = FIZZ;

        Assert.assertEquals(key_word, numbersList.get(2));
        Assert.assertEquals(key_word, numbersList.get(5));
        Assert.assertEquals(key_word, numbersList.get(8));
        Assert.assertEquals(key_word, numbersList.get(11));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf5() {
        List<String> numbersList = game.getNumbers(MAX_NUMBERS);

        String key_word = BUZZ;

        Assert.assertEquals(key_word, numbersList.get(4));
        Assert.assertEquals(key_word, numbersList.get(9));
        Assert.assertEquals(key_word, numbersList.get(19));
        Assert.assertEquals(key_word, numbersList.get(25));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf3And5() {
        List<String> numbersList = game.getNumbers(MAX_NUMBERS);

        String key_word = FIZZ + BUZZ;

        Assert.assertEquals(key_word, numbersList.get(14));
        Assert.assertEquals(key_word, numbersList.get(29));
        Assert.assertEquals(key_word, numbersList.get(59));
        Assert.assertEquals(key_word, numbersList.get(89));
    }

}
