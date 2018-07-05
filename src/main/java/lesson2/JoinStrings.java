package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JoinStrings {

    public static void main(String[] args) {

            JoinStrings joinStrings = new JoinStrings();
            joinStrings.join();
    }

    public void join(){
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "longWord");

        String resultList = list.stream()
                .skip(1)
                .limit(3)
                .collect(Collectors.joining("-"));
        System.out.println("Joining  words: " + resultList);
    }
}
