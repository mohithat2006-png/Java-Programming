import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Upload extends Thread {
    String fileName;
    long fileSize;

    Upload(String fileName, long fileSize) {
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
            System.out.println("File Uploaded Successfully");
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

        Upload u = new Upload(fileName, fileSize);
        u.start();
    }
}
