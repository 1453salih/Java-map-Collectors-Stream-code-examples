import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseNames {
    public List<String> writeUpperCaseNames(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
