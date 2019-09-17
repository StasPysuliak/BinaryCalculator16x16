public class WithDecimal {
    public WithDecimal() {
    }

    public static String answer(int toNotation, long dec) {
        String ans;
        for(ans = ""; dec > 0L; dec /= (long)toNotation) {
            switch((int)dec % toNotation) {
                case 10:
                    ans = ans + "A";
                    break;
                case 11:
                    ans = ans + "B";
                    break;
                case 12:
                    ans = ans + "C";
                    break;
                case 13:
                    ans = ans + "D";
                    break;
                case 14:
                    ans = ans + "E";
                    break;
                case 15:
                    ans = ans + "F";
                    break;
                default:
                    ans = ans + dec % (long)toNotation;
            }
        }

        return (new StringBuffer(ans)).reverse().toString();
    }
}