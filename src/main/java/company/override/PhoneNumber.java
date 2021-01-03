package company.override;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private static final Comparator<PhoneNumber> PHONE_NUMBER_COMPARATOR =
            Comparator.comparingInt((PhoneNumber p) -> p.areaCode)
                    .thenComparingInt(p -> p.number)
            ;
    protected int areaCode;
    protected int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) {
            PhoneNumber that = (PhoneNumber) o;
            return areaCode == that.areaCode &&
                    number == that.number;
        }
        return false;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return (this.areaCode > o.areaCode && this.number > o.number) ? 1 : -1;
    }


//    @Override
//    public int compareTo(PhoneNumber o) {
//        return PHONE_NUMBER_COMPARATOR.compare(this, o);
//    }

    public static void main(String[] args) {
        System.out.println((new PhoneNumberHash(1, 1)).equals(new PhoneNumber(1, 1)));
        System.out.println((new PhoneNumber(1, 1)).equals(new PhoneNumberHash(1, 1)));
        System.out.println((new PhoneNumber(1, 1)).equals(new PhoneNumber(1, 1)));
    }
}
