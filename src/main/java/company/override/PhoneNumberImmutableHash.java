package company.override;

import java.util.Objects;

public class PhoneNumberImmutableHash extends PhoneNumber {
    private final int hash;

    public PhoneNumberImmutableHash(int areaCode, int number) {
        super(areaCode, number);
        this.hash = Objects.hash(areaCode, number);
    }

    @Override
    public int hashCode() {
        return hash;
    }
}
