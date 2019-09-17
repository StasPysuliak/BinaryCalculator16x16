import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from;
        do {
            do {
                System.out.println("Convert with : ");
                from = scanner.nextInt();
            } while(from < 2);
        } while(from > 16);

        int to;
        do {
            do {
                System.out.println("Convert to : ");
                to = scanner.nextInt();
            } while(to < 2);
        } while(to > 16);

        System.out.println("Enter the number : ");
        String what = scanner.next();
        long inDecimal = ToDecimal.transform(what, from);
        System.out.println(WithDecimal.answer(to, inDecimal));
    }
}