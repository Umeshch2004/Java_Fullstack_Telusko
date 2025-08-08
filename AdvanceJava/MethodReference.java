
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Umesh", "Tushar", "Ranjith");
        
        List<String> uName = names.stream()
                                    .map(String::toUpperCase)
                                    .toList();
        
        uName.forEach(System.out::println);
    }
}
