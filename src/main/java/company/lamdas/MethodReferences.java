package company.lamdas;

import java.util.function.Function;

public class MethodReferences {
    static Function<Integer, Integer> f1 = MethodReferences::addOne;
    static Function<Integer, Integer> f2 = f -> f + 1;

    private static Integer addOne(Integer integer) {
        return integer + 1;
    }

    public static void main(String args[]) {
        System.out.println(f1.apply(2));
    }
}
