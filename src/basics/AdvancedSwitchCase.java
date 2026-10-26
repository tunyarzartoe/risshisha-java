package basics;

public class AdvancedSwitchCase {

	public static void main(String[] args) {
		int day = 3;
        String result = switch (day) {
            case 1, 2 -> "Start of the week";
            case 3, 4, 5 -> {
                System.out.println("Midweek");
                yield "Middle of the week";
            }
            default -> "Weekend";
        };
        System.out.println(result);
	}

}
