
import java.io.File;
import java.util.Scanner;

class ImageCopy extends Thread {
    String fileName;
    long fileSize;

    ImageCopy(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void run() {
        System.out.println("Image File Copied Successfully");
    }
}

class TextCopy implements Runnable {
    String fileName;
    long fileSize;

    TextCopy(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void run() {
        System.out.println("Text File Copied Successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        long fileSize = sc.nextLong();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File Not Found Exception");
        } else if (fileSize <= 0) {
            System.out.println("Invalid File Size");
        } else if (fileName.endsWith(".jpg") ||
                   fileName.endsWith(".png")) {
            ImageCopy image = new ImageCopy(fileName, fileSize);
            image.start();
        } else if (fileName.endsWith(".txt")) {
            TextCopy text = new TextCopy(fileName, fileSize);
            Thread t = new Thread(text);
            t.start();
        } else {
            System.out.println("Unsupported File Type");
        }
    }
}
