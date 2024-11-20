public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // הגבול העליון
        String mode = args[1]; 

        if (mode.equals("v")) { // מצב verbose
            for (int i = 1; i <= n; i++) {
                int steps = 0;
                int current = i;

                System.out.print(current); // הצגת הזרע הראשון ברצף

                while (current != 1) {
                    steps++;
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    System.out.print(" " + current); // הדפסת הערך הבא ברצף
                }

                steps++; // כולל את הצעד האחרון שבו מגיעים ל-1
                System.out.println(" (" + steps + ")"); // סגירת הרצף עם מספר הצעדים
            }
        }

        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
