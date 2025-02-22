import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(someMethod(List.of("Alesha", "Pasha", "Vladimir")));
    }

    public static List<String> someMethod(List<String> list) {
        return list.stream()
                .map(string -> string.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }
}