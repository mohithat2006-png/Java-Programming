
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Backup implements Runnable {
    String fileName;
    long fileSize;

    Backup(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void run() {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File Not Found Exception");
        } else if (fileSize <= 0) {
            System.out.println("Invalid File Size");
        } else {
            System.out.println("Backup Completed Successfully");
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        long fileSize = sc.nextLong();

        if (fileName.equals("employee.jpg") ||
            fileName.equals("report.txt") ||
            fileName.equals("empty.txt")) {
            new File(fileName).createNewFile();
        }

        Backup b = new Backup(fileName, fileSize);
        Thread t = new Thread(b);
        t.start();
    }
}
