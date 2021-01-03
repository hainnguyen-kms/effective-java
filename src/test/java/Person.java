import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String name;
    private int age;

    public static void main(String[] args) {
        Person person = Person.builder()
                .name("john")
                .age(1)
                .build();

        System.out.println(person);
    }
}


