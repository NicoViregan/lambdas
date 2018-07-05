package lesson1;
import java.util.List;
import java.util.Arrays;
public class NumberFromList {

    public static void main(String[] args) {
        NumberFromList numberFromList = new NumberFromList();
        numberFromList.getNumbers();
    }

    public void getNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //new Thread(() -> list.forEach(System.out::print)).start();

        new Thread(() -> list.forEach(x->System.out.println(x))).start();
    }
}
