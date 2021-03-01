import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
