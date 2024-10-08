import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
