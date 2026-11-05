import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        // TODO A2: Use try–catch to handle FileNotFoundException

        try {
            // TODO B1: Create a Scanner to read the file
            // TODO B2: Print "Student Grades:"
            // TODO B3: Read and print each line from the file
            File grades = new File("grades.txt");
            Scanner gradesReader = new Scanner(grades);

            System.out.println("Student Grades: ");

            while (gradesReader.hasNextLine()) {
                System.out.println(gradesReader.nextLine());
            }

        }
        catch (Exception e) {
            // TODO C1: Print "File not found!" if grades.txt is missing
            System.out.println("File now found!");
        }
    }
}
