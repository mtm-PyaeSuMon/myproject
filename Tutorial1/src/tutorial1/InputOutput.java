package tutorial1;

import java.io.File;

/**
 * <h2>InputOutputClass</h2>
 * <p>
 * Process for DisplayingInputOutput
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class InputOutput {

    /**
     * <h2>main
     * <p>
     *
     * </p>
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\PyaeSuMon\\Desktop\\pp\\Backend\\Assignment\\ass2.txt");
        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }

}
