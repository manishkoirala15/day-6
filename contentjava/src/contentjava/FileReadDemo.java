package contentjava;

import java.io.*;

public class FileReadDemo {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("d://abc.txt");
        BufferedReader br = new BufferedReader(fr);

        while (true) {
            String line = br.readLine();    
            
            if (line == null) {             
                break;
            }

            System.out.println(line);
        }

        br.close();
        fr.close();
    }
}
