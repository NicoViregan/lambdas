package lesson1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveOddLengthsWords {

    public static void main(String[] args) {
        RemoveOddLengthsWords removeOddLengthsWords = new RemoveOddLengthsWords();
        removeOddLengthsWords.remove();
    }

    public void remove(){
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "longWord");
        List<String> resultList = list.stream()
                                        .filter(s->(s.length() % 2) == 0)
                                        .collect(Collectors.toList());
        System.out.println("Removing  words:" + resultList);
    }
}
