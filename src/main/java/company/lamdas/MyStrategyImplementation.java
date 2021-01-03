package company.lamdas;

import java.util.function.Supplier;

public class MyStrategyImplementation {
    private final Supplier<String> stringSupplier;

    private MyStrategyImplementation(Supplier<String> stringSupplier) {
        this.stringSupplier = stringSupplier;
    }

    public static MyStrategyImplementation of(Supplier<String> stringSupplier) {
        return new MyStrategyImplementation(stringSupplier);
    }

    public void doSomething() {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        System.out.println(stringSupplier.get());

        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
    }

    public static void main(String args[]) {
        MyStrategyImplementation.of(() -> "hihihihi").doSomething();
        System.out.println("--------------------------------------");
        MyStrategyImplementation.of(() -> "huhuhuhu").doSomething();
    }
}
