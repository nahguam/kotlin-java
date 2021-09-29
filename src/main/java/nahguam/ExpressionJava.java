package nahguam;

public class ExpressionJava {

    int doubleIfEven(int i) {
        if (i % 2==0) {
            return i * 2;
        }
        return i;
    }

    int doubleWhenEven(int i) {
        switch (i % 2) {
            case 0:
                return i * 2;
            default:
                return i;
        }
    }

    int tryDoIt() {
        try {
            return throwingFunction();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static int throwingFunction() throws Exception {
        throw new Exception();
    }
}
