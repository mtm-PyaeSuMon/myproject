package tutorial1;

import java.util.Date;
import java.io.File;

/**
 * <h2>Tutorial6aClass</h2>
 * <p>
 * Process for DisplayingTutorial6a
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial6a {

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
        String filePath = "C:\\Users\\PyaeSuMon\\Desktop\\pp\\Daily Report.txt";
        // creating file object
        File file = new File(filePath);
        // getting the last modify time
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("Given file last modified time: " + date);
    }

}
