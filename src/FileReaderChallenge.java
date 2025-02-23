import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderChallenge {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)){
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Your file is not found: %s ", e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Unable to read file");
        }
    }
}
