import java.util.HashMap;
import java.util.Map;

public class map{
    public static void main(String a[]) {
        Map<String, Integer>students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Umesh", 97);
        students.put("Kiran", 92);
        students.put("Umesh", 45);


        System.out.println(students.keySet());

        for(String name : students.keySet())
        {
            System.out.println(name + ":" + students.get(name));
            
        }
        
    }
}
