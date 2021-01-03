import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FITest {
    @Test
    public void test() {
        doSth(
                t -> t + 2,
                (x, y) -> x + " " + y,
                x -> 4,
                x -> x == 1 ? true : false,
                () -> new FITest(),
                x -> System.out.println(x),
                1,
                "abc"
        );
    }

    public void doSth(
            UnaryOperator<Integer> f1,
            BinaryOperator<String> f2,
            Function<Integer, Integer> f3,
            Predicate<Integer> f4,
            Supplier<FITest> f5,
            Consumer<Integer> f6, int val1, String val2) {

        System.out.println(f1.apply(val1));
        System.out.println(f2.apply(val2, val2));
        System.out.println(f3.apply(val1));
        System.out.println(f4.test(val1));
        System.out.println(f5.get());
        f6.accept(val1);
    }



    public Integer doSth2(String a) {
        return 1;
    }


    @Test
    public void testMethodReferences() {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // void forEach(Consumer<? super T> action);
        messages.stream().map(this::doSth2).forEach(System.out::println);
    }
}
