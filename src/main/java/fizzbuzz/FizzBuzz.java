package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";

    public List<String> getNumbers(int max) {

        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            numbers.add(evaluate(i));
        }

        return numbers;
    }

    private String evaluate(int number) {

        String eval = "";

        if(number%3 == 0) eval += FIZZ;

        if(number%5 == 0) eval += BUZZ;

        if(eval == "") eval = String.valueOf(number);

        return eval;
    }
}
