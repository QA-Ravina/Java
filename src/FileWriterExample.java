import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {


    public static void main(String[] args) {
        String fileName = "MyFile.txt";
        try (FileWriter myFile = new FileWriter(fileName)){
            myFile.write("My name is Ravina");

            for (int i = 1; i <=100 ; i++)
            {
                myFile.write("@");
            }
            myFile.flush();
        } catch (IOException e) {
            System.out.println("Exception caught : " + e.getMessage()  );

        }


    }


}

