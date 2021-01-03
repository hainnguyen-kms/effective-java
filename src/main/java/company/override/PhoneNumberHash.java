package company.override;

import java.util.Objects;

public class PhoneNumberHash extends PhoneNumber {
    public PhoneNumberHash(int areaCode, int number) {
        super(areaCode, number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) {
            PhoneNumberHash that = (PhoneNumberHash) o;
            return areaCode == that.areaCode &&
                    number == that.number;
        }
        return false;
    }
}
