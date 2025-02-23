import java.io.FileReader;
import java.io.IOException;

public class fileReaderExample {

    public static void main(String[] args) {
        String file = "MyFile.txt";
       try  (FileReader F1 = new FileReader(file)) {
                int read = 0;
                do {
                    read = F1.read();
                    System.out.print((char)read);
                } while (read != -1);



       } catch (IOException e){
           System.out.printf("Exception occured : %s", e.getMessage() );
       }
    }
}
