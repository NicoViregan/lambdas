package lesson3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RandomWords {

    private List<String> initialWords;

    RandomWords() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Words.txt"));
            initialWords = reader.lines().collect(Collectors.toList());

            System.out.println("Number of words read:  " + initialWords.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<String> createList(int listSize) {
        Random rand = new Random();

        List<String> wordList = rand.ints(listSize, 0, initialWords.size())
                .mapToObj(initialWords::get)
                .collect(Collectors.toList());

        return wordList;

    }

    public static void main(String[] args) {
        RandomWords r = new RandomWords();
        List<String> newList = r.createList(5);
        System.out.println("New list: " + newList);
    }
}

