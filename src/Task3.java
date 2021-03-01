import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(15));
        }
        System.out.println(list);

        list = list.stream()
                .map(e -> e*e)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
