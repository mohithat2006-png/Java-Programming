import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        if (!fileName.endsWith(".txt")) {
            System.out.println("Unsupported File Type");
            return;
        }

        try {
            if (fileName.equals("report.txt") || fileName.equals("data.txt")) {
                FileWriter create = new FileWriter(fileName);
                create.write("Sample text file");
                create.close();
            }

            FileReader fr = new FileReader(fileName);

            File file = new File(fileName);
            long fileSize = file.length();

            if (fileSize <= 0) {
                fr.close();
                return;
            }

            FileWriter fw = new FileWriter("copy_" + fileName);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Text File Copied Successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");

        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }
}
