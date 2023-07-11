
enum Month {
    JAN,
    FEB,
    MAR,
    APR,
    MAY
}

public class Main {
    public static void main(String[] args) {
        Month mon = Month.MAY;
        switch (mon) {
            case JAN:
                System.out.println("There are 31 Days in jan");
                break;
            case FEB:
                System.out.println("There are 31 Days in Feb");
                break;
            case APR:
                System.out.println("There are 31 Days in Apr");
                break;
            case MAR:
                System.out.println("There are 31 Days in Mar");
                break;
            case MAY:
                System.out.println("There are 31 Days in May");

        }
    }
}
