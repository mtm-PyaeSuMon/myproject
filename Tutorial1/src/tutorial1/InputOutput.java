package tutorial1;
import java.io.File;
public class InputOutput {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
     // Create a File object
        File my_file_dir = new File("C:\\Users\\PyaeSuMon\\Desktop\\pp\\Backend\\Assignment\\ass2.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
    }

}
