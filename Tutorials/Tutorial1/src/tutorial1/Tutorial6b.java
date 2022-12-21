package tutorial1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <h2>Tutorial6bClass</h2>
 * <p>
 * Process for DisplayingTutorial6b
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial6b {

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
        StringBuilder sb = new StringBuilder();
        String strline = " ";
        try {
            String filename = "C:\\Users\\PyaeSuMon\\Desktop\\pp\\text.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("JavaExercise\n");
            fw.write("MyTesting\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PyaeSuMon\\Desktop\\pp\\text.txt"));
            while (strline != null) {
                sb.append(strline);
                sb.append(System.lineSeparator());
                strline = br.readLine();
                System.out.println(strline);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

}
