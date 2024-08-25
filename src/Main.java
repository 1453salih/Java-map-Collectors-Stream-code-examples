
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SquareCalculator calculator = new SquareCalculator();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = calculator.calculateSquares(numbers);
        System.out.println(squares);
    }
}

