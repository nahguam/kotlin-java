package nahguam;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsJava {
    void collections() {
        var list = List.of(1, 2, 3);

        var immutableIntermediate = list.stream().map(i -> i * 2).collect(Collectors.toList());
        immutableIntermediate.stream().map(i -> i - 1).collect(Collectors.toList());


        list.stream().map(i -> i * 2).map(i -> i - 1).collect(Collectors.toList());

    }
}
