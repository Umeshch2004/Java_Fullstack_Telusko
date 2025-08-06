import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age) return 1;
        else return -1;
    }


}

public class comparator {
    public static void main(String[] args) {

        Comparator<Student> com = (Student i, Student j) ->
        { 
                // if(i.age > j.age)
                //     return 1;
                // else 
                //     return -1;

                //or

                return i.age>j.age?1:-1;
            
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Umesh"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(51, "Parul"));
        studs.add(new Student(22, "Navya"));
        
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        Collections.sort(studs);

        for(Student s : studs)
            System.out.println(s);
    }   
}
