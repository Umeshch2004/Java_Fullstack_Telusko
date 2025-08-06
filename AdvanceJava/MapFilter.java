import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Predicate<Integer> p = new Predicate<Integer>() {

        //     @Override
        //     public boolean test(Integer n) {
        //         if(n%2==0) return true;
        //         else return false;
        //     }
            
        // };

        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
        //     public Integer apply(Integer n) {

        //         return n*2;
        //     }

        // };

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted();
                       

        // int res  = nums.stream()
        //     .filter(n -> n*2==0)
        //     .map(fun)
        //     .reduce(0, (c,e) -> c+e);


        sortedValues.forEach(n -> System.out.println(n));
    }
}
