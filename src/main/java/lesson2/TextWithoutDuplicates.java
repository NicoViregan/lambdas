package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TextWithoutDuplicates {

    public static void main(String[] args) {

        TextWithoutDuplicates text = new TextWithoutDuplicates();
        text.removeDuplicates();
    }

    public void removeDuplicates(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            List<String> resultList = reader
                                        .lines()
                                        .flatMap(x-> Stream.of(x.split(" ")))
                                        .distinct()
                                        .collect(Collectors.toList());

            System.out.println("Lines number: " + resultList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
