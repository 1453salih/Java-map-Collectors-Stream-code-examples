import java.util.List;
import java.util.stream.Collectors;

public class SquareCalculator {

    public List<Integer> calculateSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
