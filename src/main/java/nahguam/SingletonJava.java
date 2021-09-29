package nahguam;

public class SingletonJava {
    private static SingletonJava instance;

    public static SingletonJava getInstance() {
        if (instance==null) {
            instance = new SingletonJava();
        }
        return instance;
    }

    public void doIt() {
        //TODO
    }

    enum EnumSingleton {
        INSTANCE;

        public void doIt() {
            //TODO
        }
    }
}
