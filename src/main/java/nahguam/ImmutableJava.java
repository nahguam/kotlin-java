package nahguam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableJava {
    public static void main(String[] args) {
        var mutable = 1;
        mutable = 2;

        final var immutable = 1;
//        immutable = 2;

        new ImmutableJava().immutableList();
    }

    void mutableParam(int i) {
        i = 2;
    }

    void immutableParam(final int i) {
//        i = 2;
    }

    void immutableList() {
        var list = List.of(1, 2, 3);
        list.add(4); //Intellij warning, runtime exception
    }

    void immutableList2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list = Collections.unmodifiableList(list);
        list.add(4); //Intellij warning, runtime exception
    }
}
