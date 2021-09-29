package nahguam;

import org.jetbrains.annotations.NotNull;

public class InteropJava {
    interface InterfaceNullable {
        void doIt(Integer i);
    }

    interface InterfaceNotNullable {
        void doIt(@NotNull Integer i); // also supports javax and lombok annotations
    }
}
