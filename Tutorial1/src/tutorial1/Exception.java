package tutorial1;

public class Exception {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            System.out.println("Try block:");
            int num = 67 / 0;
            System.out.println(num);
        }
        // catch block
        catch (ArithmeticException e) {
            System.out.println("Catch block:");
            System.out.println("ArithmeticException::Number divided by zero");
        }
        // finally block
        finally {
            System.out.println("Finally block:");
        }
        System.out.println("Rest of the code continues...");
    }

}
