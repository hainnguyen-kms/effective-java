package company.enums;

public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("hello world");
    }

    public static void main(String args[]) {
        INSTANCE.doSomething();
    }
}
