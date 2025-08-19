public class hello
{
    public static void main(String a[]) {
        String day = "Monday";
        String res = "";

        switch(day)
        {
            case "Sunday", "Saturday":
                res = "6am";
                break;
            case "Monday", "Tuesday":
                res = "7am";
                break;
            default:
                res = "8am";
        }

        System.out.println(res);
        
    }
}
