package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LowerCaseList {

    public static void main(String[] args) {

        LowerCaseList l = new LowerCaseList();
        l.lowerCase();;
    }

    public void lowerCase() {
        List<String> list = Arrays.asList("ONE", "tWo", "tHReE", "four", "fIVE", "longWORd");

        List<String> resultList = list.stream()
                                        .map(x->x.toLowerCase())
                                        .collect(Collectors.toList());
        System.out.println("Lower Case list: " + resultList);

    }

}
