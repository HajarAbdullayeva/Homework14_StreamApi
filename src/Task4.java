import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Forrest Gump");
        list.add("Aliens");
        list.add("The Dark Knight");
        list.add("Pulp Fiction");
        list.add("Avengers");
        list.add("A Separation");
        list.add("The Shawshank Redemption");
        list.add("A Beautiful Mind");
        System.out.println(list);


        list = list.stream()
                .filter(Task4::beginWithA)
//                .filter(e -> beginWithA(e))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static boolean beginWithA(String nameOfMovie) {
        return nameOfMovie.startsWith("A");
    }
}
