package company.lamdas;

import java.util.function.BinaryOperator;

public enum Operation {
    ADD((a, b) -> a + b),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b),
    ;


    private BinaryOperator<Integer> operator;

    Operation(BinaryOperator<Integer> operator) {
        this.operator = operator;
    }

    public int apply(int a, int b) {
        return operator.apply(a, b);
    }

    public static void main(String args[]) {
        System.out.println(Operation.ADD.apply(1, 2));
    }
}
