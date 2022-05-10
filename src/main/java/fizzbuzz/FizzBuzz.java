package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> getNumbers(int max) {

        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            numbers.add(String.valueOf(i));
        }

        return numbers;
    }
}
