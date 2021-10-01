package nahguam;

import java.util.Map;
import java.util.Optional;

import org.jetbrains.annotations.Nullable;

public class NullabilityJava {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(1, 1);

        map.entrySet().stream()
                .map(entry -> valueTimes2OrDefault(entry, 1))
                .forEach(System.out::println);
    }

    static <K> int valueTimes2OrDefault(@Nullable Map.Entry<K, Integer> entry, int defaultValue) {
        if (entry==null) {
            return defaultValue;
        }
        Integer value = entry.getValue();
        if (value!=null) {
            return value * 2;
        }
        return defaultValue;
    }

    static <K> int valueTimes2OrDefaultAlternativa(@Nullable Map.Entry<K, Integer> entry, int defaultValue) {
        return Optional.ofNullable(entry).map(Map.Entry::getValue).map(i -> i * 2).orElse(defaultValue);
    }
}
