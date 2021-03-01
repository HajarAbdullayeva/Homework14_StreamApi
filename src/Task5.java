import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Forrest Gump");
        list.add("Aliens");
        list.add("The Dark Knight");
        list.add("The Shawshank Redemption");
        list.add("Pulp Fiction");
        list.add("Avengers");
        list.add("A Separation");
        list.add("Pulp Fiction");
        list.add("The Shawshank Redemption");
        list.add("A Beautiful Mind");
        list.add("Pulp Fiction");
        System.out.println(list);

        list = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
