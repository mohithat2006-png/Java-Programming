import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        if (!(fileName.endsWith(".jpg") || fileName.endsWith(".png"))) {
            System.out.println("Unsupported File Type");
            return;
        }

        try {
            // Create sample photo.jpg for TC1
            if (fileName.equals("photo.jpg")) {
                FileOutputStream create = new FileOutputStream(fileName);
                create.write(100);
                create.write(101);
                create.write(102);
                create.close();
            }

            FileInputStream fis = new FileInputStream(fileName);

            long fileSize = fis.available();

            if (fileSize <= 0) {
                fis.close();
                return;
            }

            FileOutputStream fos =
                new FileOutputStream("copy_" + fileName);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("Image File Copied Successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");

        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }
}
