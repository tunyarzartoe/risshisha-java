package basics;

public class CommonMultiplesTest {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);

        int common = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % base1 == 0 && i % base2 == 0) {
                System.out.println(i + ":base1,base2");
                common++;
            }

            if (i % base1 == 0) {
                System.out.println(i + ":base1");
            }

            if (i % base2 == 0) {
                System.out.println(i + ":base2");
            }
        }

        System.out.println(common);
        System.out.println(limit);
    }
}