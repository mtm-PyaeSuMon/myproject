package tutorial;

public class Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] fruits = { "Strawberry", "Orange", "Mango", "Banana" };
        fruits[1] = "Apple";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }

}
