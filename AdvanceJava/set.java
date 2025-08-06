import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set{
    public static void main(String a[]) {
    //     Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>(); // for sorted values
        
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);

        // System.out.println(nums.indexOf(5));

        // System.out.println(nums.get(2));

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        // for(int n: nums)
        // {
        //     System.out.println(n);
        // }

    }
}
