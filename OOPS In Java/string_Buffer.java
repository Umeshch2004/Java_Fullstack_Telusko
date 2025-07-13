public class Demo 
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Umesh");
        sb.append("Chapala");

        sb.insert(0, "Name: ");

        sb.substring(5);

        System.out.println(sb);

        String str = sb.toString();

        System.out.println(str);
    }
}