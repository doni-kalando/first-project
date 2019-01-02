import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String []args) {

        File directory = new File ("/media/doni/Etheria/projects/idea/untitled/fileDirectory/");
        File file_one = new File(directory, "test_docks.txt");

        try(FileWriter writer = new FileWriter(file_one, false)) {

            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
