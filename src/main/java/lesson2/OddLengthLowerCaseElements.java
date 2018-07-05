package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class OddLengthLowerCaseElements {

    public static void main(String[] args) {

        OddLengthLowerCaseElements filter = new OddLengthLowerCaseElements();
        filter.filterElements();
    }

    public void filterElements() {
        List<String> list = Arrays.asList("ONE", "tWo", "tHReE", "four", "fIVE", "longWORd");

        List<String> resultList =
                list.stream().map(x -> x.toLowerCase()).filter(x -> x.length() % 2 == 1).collect(Collectors.toList());
        System.out.println("Lower Case list: " + resultList);
    }

}
