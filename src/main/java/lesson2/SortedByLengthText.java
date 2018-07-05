package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortedByLengthText {

    public static void main(String[] args) {
        SortedByLengthText b = new SortedByLengthText();
        b.sortText();
    }

    public void sortText() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            List<String> resultList = reader
                    .lines()
                    .flatMap(x-> Stream.of(x.split(" ")))
                    .distinct()
                    .sorted((word1, word2) -> word1.length() - word2.length())
                    .collect(Collectors.toList());

            System.out.println("Lines number: " + resultList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
