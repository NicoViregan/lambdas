package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.regex.*;

public class SortedTextWithoutDuplicates {

    public static void main(String[] args) {
        SortedTextWithoutDuplicates a = new SortedTextWithoutDuplicates();
        a.modifyList();
    }
    public void modifyList(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            List<String> resultList = reader
                    .lines()
                    .flatMap(x-> Stream.of(x.split(" ")))
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Lines number: " + resultList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
