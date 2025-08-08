
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Umesh", "Navya", "John", "Ranjith");
        
        Optional<String> name = names.stream()
                            .filter(str -> str.contains("U"))
                            .findFirst();
        
        System.out.println(name.orElse("Not found"));
    }
}
 