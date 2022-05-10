package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5() {
        FizzBuzz game = new FizzBuzz();
        List<String> numbersList = game.getNumbers(100);

        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("6", numbersList.get(5));
        Assert.assertEquals("13", numbersList.get(12));
    }

}
