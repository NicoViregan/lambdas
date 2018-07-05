package lesson2;
import java.io.*;


public class LinesCounter {

    public static void main(String[] args) {
        LinesCounter counter = new LinesCounter();
        counter.countLines();

    }

    public void countLines() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            long linesNumber = reader.lines().count();

            System.out.println("Lines number: " + linesNumber);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
