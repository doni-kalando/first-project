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
        File directory = new File (in.next());


        System.out.println("\n Enter the file name. \n " +
                " (Attention! document name must not contain spaces). \n " +
                " Example: readable_dock.txt \n " +
                "Input a Name file:");
        File file_two = new File(directory, in.next());


        File file_one = new File(directory, "test_docks.txt");


        if(directory.exists() && file_one.exists() && file_two.exists()){
            System.out.println("\n Directory and Files true");

            //Считывание из файла, через буфиризацию
            getReadFile(file_two);

            //Запись в файл, через буфиризацию
            getWriteFile(file_one);

        }else {
            System.out.println("\n Directory and Files false");
        }

    }

    /**
     * Метод принимает путь и имя файла, после открывает файл и считывает его построчно, выводя результат в консоль.
     * @param nameReadableFile
     */
    private static void getReadFile(File nameReadableFile){
        try(BufferedReader br = new BufferedReader(new FileReader(nameReadableFile)))
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
    }

    /**
     * Метод принимает путь и имя файла, после открывает файл и записывает в него строку.
     * @param nameRecordedFile
     */
    private static void getWriteFile(File nameRecordedFile){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nameRecordedFile)))
        {
            String text = " Hello  World! \n Hey! Teachers! Leave them kids alone.";
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
