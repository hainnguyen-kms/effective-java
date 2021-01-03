import company.factory.PhoneNumber;
import org.junit.Test;

public class PhoneNumberBuilderTest {
    @Test
    public void testBuilder() {
        PhoneNumber phoneNumber = PhoneNumber.builder()
                .number(1)
                .area(2)
                .build();
        System.out.println(phoneNumber);

    }
}