package tutorial1;

import java.util.Date;
import java.io.File;

public class Tutorial6a {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String filePath = "C:\\Users\\PyaeSuMon\\Desktop\\pp\\Daily Report.txt";
        // creating file object
        File file = new File(filePath);
        // getting the last modify time
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("Given file last modified time: " + date);
    }

}
