package Testing;

import java.util.Scanner;

public class green {
    public static void main(String[] args) {
        int size, temp;    
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = in.nextInt();       
        int [] array = new int[size];
        int [] array1 = new int[size];
        int greenest=array[0];
        System.out.println("Enter all the elements: \t");
        
        for (int i = 0; i < size; i++) {
            array[i]= array1[i] = in.nextInt();
        }
        
        System.out.println();
        System.out.println("Array List:");
     
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print("\t");
            }
        
        for (int i = 0; i < size; i++) {
          for (int j = i + 1; j < size; j++) {
            if (array[i] > array[j]) {
                temp = array[i];
              array[i] = array[j];
              array[j] = temp;
            }
          }
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("The Second Largest Elements in the Array is :" + array[size-2]);
        int second = array[size-2];
        
        for (int i = 0; i < size; i++) {
            if(array[i]>greenest) {
                greenest =array[i];
            }
        }
        System.out.print("\n");
        System.out.println("The Largest Elements in the array is: "+greenest);
        
        for(int i=0;i<size;i++) {
            if(greenest>array1[i]) {
                array1[i]=greenest;
                System.out.print(array1[i]);
                System.out.print("\t");
            } else {
                array1[i] = second;
                System.out.print(array1[i]);
                System.out.print("\t");
            }
        }
    }
    
}
