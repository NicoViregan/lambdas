package lesson1;
import java.util.Arrays;
import java.util.List;

public class FirstLetterMerger {

    public static void main(String[] args) {
        FirstLetterMerger firstLetterMerger = new FirstLetterMerger();
        firstLetterMerger.merge();
    }

    public void merge() {

        List<String> list = Arrays.asList("one", "two", "three");
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append(s.charAt(0)));
        String finalResult = sb.toString();
        System.out.println("Merging first letters result: " + finalResult);

    }

}
