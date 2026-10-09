package stars_program;

public class HeartStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j <= 6; j++) {
//				if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {

                if ((i == 0 && (j == 2 || j == 3 || j == 8 || j == 9))
                        || (i == 1 && (j != 0 && j != 6 && j != 12))
                        || (i == 2 && j != 0 && j != 12)
                        || (i == 3 && j > 1 && j < 11)
                        || (i == 4 && j > 2 && j < 10)
                        || (i == 5 && j > 3 && j < 9)
                        || (i == 6 && j == 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
