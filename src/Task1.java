import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        list = list.stream()
                .filter(Task1::hasRootElement)
               // .filter(e-> hasRootElement(e))
                //.map(e -> e * 2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Elements with a perfect square root: " + list);


        int result = list.stream()
                .reduce(0, (Integer::sum));
//                .reduce(0, ((e, e1) -> e + e1));

        System.out.println("The sum of numbers with a perfect square root: " + result);

    }

    private static boolean hasRootElement(int element) {
        double result = Math.sqrt(element);
        if (result == 0)
            return false;
        else
            return result - (int) result == 0;

    }
}
