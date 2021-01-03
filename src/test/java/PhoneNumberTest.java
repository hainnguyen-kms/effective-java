import company.factory.VietNamPhoneNumber;
import company.override.PhoneNumber;
import company.override.PhoneNumberHash;
import company.override.PhoneNumberImmutableHash;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.*;

public class PhoneNumberTest {
    @Test
    public void testFactory() {
        PhoneNumberHash phoneNumber = new PhoneNumberHash(1, 2);
        PhoneNumberImmutableHash phoneNumber2 = new PhoneNumberImmutableHash(2, 2);

        Map<PhoneNumber, Integer> phoneNumberIntegerMap = new HashMap<>();

        phoneNumberIntegerMap.put(phoneNumber, 100);
        phoneNumberIntegerMap.put(phoneNumber2, 200);

        System.out.println(phoneNumberIntegerMap.get(phoneNumber));
        System.out.println(phoneNumberIntegerMap.get(phoneNumber2));

        System.out.println("---------------------------------");
        phoneNumber.setAreaCode(3);
        phoneNumber2.setAreaCode(3);
        System.out.println(phoneNumberIntegerMap.get(phoneNumber));
        System.out.println(phoneNumberIntegerMap.get(phoneNumber2));

        System.out.println("---------------------------------");
        phoneNumber.setAreaCode(1);
        System.out.println(phoneNumberIntegerMap.get(phoneNumber));
    }

    @Test
    public void testComparator() {
        System.out.println(new PhoneNumber(2, 2).compareTo(new PhoneNumber(1, 1)));
    }

    @Test
    public void testHash() {
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
        System.out.println(Objects.hash(1 ,2));
    }
}