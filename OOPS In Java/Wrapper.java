public class Wrapper {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; //autoboxing

        int num2 = num1.intValue(); //auto-unboxing

        System.out.println(num2);

        String str=  "123";
        int num3 = Integer.parseInt(str);

        System.out.println(num3);
    }
}
