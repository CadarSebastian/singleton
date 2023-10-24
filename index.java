public class Singleton {
    private static Singleton instance = null;
    
    private String data;
    private Singleton() {
        data = "Acesta este un exemplu de Singleton.";
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public String getData() {
        return data;
    }
    public static void main(String[] args) {
  
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.getData());

        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(anotherSingleton.getData());
    }
}
