public class ToDecimal {
    public ToDecimal() {
    }

    public static long transform(String number, int withNotation) {
        long dec = 0L;

        for(int i = 0; i <= number.length() - 1; ++i) {
            switch(number.charAt(i)) {
                case 'A':
                    dec = (long)((double)dec + 10.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                case 'B':
                    dec = (long)((double)dec + 11.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                case 'C':
                    dec = (long)((double)dec + 12.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                case 'D':
                    dec = (long)((double)dec + 13.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                case 'E':
                    dec = (long)((double)dec + 14.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                case 'F':
                    dec = (long)((double)dec + 15.0D * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
                    break;
                default:
                    dec = (long)((double)dec + (double)(number.charAt(i) - 48) * Math.pow((double)withNotation, (double)(number.length() - i - 1)));
            }
        }

        return dec;
    }
}
