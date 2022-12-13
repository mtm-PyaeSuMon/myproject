package tutorial1;

import java.io.*;

public class Tutorial6c {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       BufferedReader br=null;
       String strline=" ";
       try {
           LineNumberReader reader= new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\PyaeSuMon\\Desktop\\pp\\text.txt")));
           while(((strline = reader.readLine()) != null) && reader.getLineNumber()<=3){
               System.out.println(strline);
           }
           reader.close();
       }catch(FileNotFoundException fe) {
           System.out.println("File not found");
       }catch(IOException e) {
           System.err.println("Unable to read the file");
       }
    }
}
