package contentjava;
import java.io.*;

public class SimpleReadFile {
	public static void main(String[] args) {
        int countMy = 0;   

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\test\\nepal.txt"));

            String line;

            
            while ((line = br.readLine()) != null) {

                System.out.println(line);   

                
                line = line.toLowerCase();

                
                String words[] = line.split(" ");

                
                for (String w : words) {
                    if (w.equals("my")) {
                        countMy++;  
                    }
                }
            }

            br.close(); 

            
            System.out.println("\nTotal 'my' = " + countMy);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
