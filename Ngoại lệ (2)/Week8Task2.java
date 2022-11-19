import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    /**
     * null pointer exception.
     */
    public void nullPointerEx() {
        String s = null;
        System.out.println(s.length());
    }

    /**
     * Index out of bounds exception.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] a = new int[5];
        System.out.println(a[5]);
    }

    /**
     * Arithmetic exception.
     */
    public void arithmeticEx() throws ArithmeticException {
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }

    /**
     * File not found exception.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File f = new File("C:\\Users\\User\\Desktop\\file.txt");
        Scanner sc = new Scanner(f);
    }

    /**
     * IO exception.
     */
    public void ioEx() throws IOException {
        File f = new File("C:\\Users\\User\\Desktop\\file.txt");
        Scanner sc = new Scanner(f);
    }

    /**
     * null pointer exception.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return ("Lỗi Null Pointer");
        }
        return null;
    }

    /**
     * Index out of bounds exception.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return ("Lỗi Array Index Out of Bounds");
        }
        return null;
    }

    /**
     * Arithmetic exception.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return ("Lỗi Arithmetic");
        }
        return null;
    }

    /**
     * File not found exception.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return ("Lỗi File Not Found");
        }
        return null;
    }

    /**
     * Io exception.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return ("Lỗi IO");
        }
        return null;
    }
}