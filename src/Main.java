import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\n Please enter the directory where the file is located. \n " +
                " (Attention! There should not be any spaces in the path). \n " +
                " Example:  /media/doni/Etheria/projects/idea/untitled/fileDirectory/ \n " +
                "Input a Directory:");
        String dir = in.next();

        System.out.println("\n Enter the file name. \n " +
                " (Attention! document name must not contain spaces). \n " +
                " Example: readable_dock.txt \n " +
                "Input a Name file:");
        String file_name = in.next();

        File directory = new File (dir);
        File file_one = new File(directory, "test_docks.txt");
        File file_two = new File(directory, file_name);

        if(directory.exists() && file_one.exists() && file_two.exists()){
            System.out.println("\n Directory and Files true");
        }else {
            System.out.println("\n Directory and Files false");
        }

        //Считывание из файла, через буфиризацию
        try(BufferedReader br = new BufferedReader(new FileReader(file_two)))
        {
            //чтение построчно
            String s;
            while((s=br.readLine())!=null){

                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //Запись в файл, через буфиризацию
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file_one)))
        {
            String text = " Hello  World! \n Hey! Teachers! Leave them kids alone.";
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
