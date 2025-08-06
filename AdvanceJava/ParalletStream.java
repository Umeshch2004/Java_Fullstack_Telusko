
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ParalletStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();
        
        for(int i=1;i<=10000;i++)
        {
            nums.add(ran.nextInt(100));
        }

        int sum1 = nums.stream()
                        .map(i -> i*2)
                        .reduce(0, (c,e) -> c+e);

        int sum2= nums.stream()
                        .map(i -> i*2)
                        .mapToInt(i -> 1)
                        .sum();

        int sum3= nums.parallelStream()
                        .map(i -> i*2)
                        .mapToInt(i -> 1)
                        .sum();

    System.out.println(sum1 + " " + sum2+ " " + sum3);
    }
}
