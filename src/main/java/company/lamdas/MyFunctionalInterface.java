package company.lamdas;

@FunctionalInterface
public interface MyFunctionalInterface {
    public void doSomething();
}

class A {
    public static void main(String[] args) {
        MyFunctionalInterface a = () -> System.out.println(123);
        a.doSomething();
    };
}