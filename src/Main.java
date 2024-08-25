
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SquareCalculator calculator = new SquareCalculator();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = calculator.calculateSquares(numbers);

        System.out.println("Karesini alma işlemi sonucu: "+squares);

        System.out.println("---------------------------------------------------");

        UpperCaseNames convertor = new UpperCaseNames();

        List<String> names = Arrays.asList("ali","veli","ayşe");

        List<String> upperCaseNames = convertor.writeUpperCaseNames(names);

        System.out.println("Büyük harfe çevirilmiş isimler: "+upperCaseNames);

        System.out.println("---------------------------------------------------");

        AverageCalculator averageCalculator = new AverageCalculator();

        double average = averageCalculator.calculateAverage(numbers);

        System.out.println("Ortalama işlemi sonucu: "+average);

        System.out.println("---------------------------------------------------");

    }
}

