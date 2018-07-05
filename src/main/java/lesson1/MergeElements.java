package lesson1;
import java.util.Map;
import java.util.TreeMap;

public class MergeElements {

    public static void main(String[] args) {

        MergeElements mergeElements = new MergeElements();
        mergeElements.merge();
    }

    public void merge(){
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((key, value)->sb.append(String.format("%s%s", key, value)));
        String finalResult = sb.toString();
        System.out.println("Merging values result: " + finalResult);
    }
}
