package nahguam;

import java.util.Objects;

import lombok.Data;

@Data
public class DataJava {
    private int value;

//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this==o) return true;
//        if (o==null || getClass()!=o.getClass()) return false;
//        DataJava dataJava = (DataJava) o;
//        return Objects.equals(value, dataJava.value);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

    public static void main(String[] args) {
        var result = new DataJava();
        result.setValue(1);
        System.out.println(result);
    }
}
