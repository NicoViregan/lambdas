package lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReplaceWithUppercase {

    public static void main(String[] args) {
        ReplaceWithUppercase replaceWithUppercase = new ReplaceWithUppercase();
        replaceWithUppercase.replace();
    }

    public void replace() {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "longWord");
        List<String> resultList = list.stream()
                .map(x->x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Replacing  words:" + resultList);
    }
}
