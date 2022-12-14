package tutorial1;

import java.io.*;

/**
 * <h2>Tutorial6cClass</h2>
 * <p>
 * Process for DisplayingTutorial6c
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial6c {

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
        @SuppressWarnings("unused")
        BufferedReader br = null;
        String strline = " ";
        try {
            LineNumberReader reader = new LineNumberReader(
                    new InputStreamReader(new FileInputStream("C:\\Users\\PyaeSuMon\\Desktop\\pp\\text.txt")));
            while (((strline = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strline);
            }
            reader.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file");
        }
    }
}
