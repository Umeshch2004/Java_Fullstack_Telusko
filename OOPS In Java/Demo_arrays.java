class Student {
    int roll;
    String name;
    int marks;
}

public class Demo_arrays {
    public static void main(String[] a) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Umesh";
        s1.marks = 99;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Tushar";
        s2.marks = 99;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ranjith";
        s3.marks = 99;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
    }
}