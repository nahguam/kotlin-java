package nahguam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExtensonFunctionsJava {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        var result = firstOdd(list.stream()).orElse(null);
        System.out.println(result);
    }

    static Optional<Integer> firstOdd(Stream<Integer> stream) {
        return stream.filter(x -> x % 2!=0)
                .findFirst();
    }
}
