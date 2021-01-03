package company.factory;

import java.time.Instant;

public class PhoneNumber {
    protected int areaCode;
    protected int number;


    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public PhoneNumber(int areaCode) {
        this.areaCode = areaCode;
    }

    public static PhoneNumber of(int areaCode, int number) {
        return new PhoneNumber(areaCode, number);
    }

    private static PhoneNumber COMMON_PHONE_NUMBER = new PhoneNumber(84, 123);
    public static PhoneNumber fromCodeAndNumber(int areaCode, int number) {
        if (areaCode == 84) {
            return COMMON_PHONE_NUMBER;
        } else if (areaCode == 1) {
            return new VietNamPhoneNumber(areaCode, number);
        }
        return new LaoPhoneNumber(areaCode, number);
    }

    public static PhoneNumber fromCodeOnly(int areaCode) {
        return new PhoneNumber(areaCode, 0);
    }

    public static PhoneNumber fromNumberOnly(int number) {
        return new PhoneNumber(0, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }

    // PhoneNumber Innerclass Scope

    public static class Builder {
        private int areaCode;
        private int number;

        public Builder area(int areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public PhoneNumber build() {
            return new PhoneNumber(areaCode, number);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
