

public class ExceptionThrowKeyword {
    public static void main(String[] args) {

        int i=0;
        int j=0;


        try {
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("I dont want to print Zero");
        } 
        catch (ArithmeticException e) {
            
            j = 18/1;
            System.out.println("That's the default output");
        } 
        catch (Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Thank You");
    }
}

