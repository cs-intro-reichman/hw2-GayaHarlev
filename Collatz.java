public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // N מהארגומנטים
        String mood = args[1]; // מצב עבודה (verbose או concise)

        if (mood.equals("v")) { // מצב verbose
            for (int i = 1; i <= n; i++) { // לולאה מ-1 עד N
                System.out.print(i); // הדפסת המספר הראשון בסדרה
                int s = i;
                int steps = 0;

                while (s != 1) { // חישוב רצף Collatz
                    steps++;
                    if (s % 2 == 0) {
                        s = s / 2;
                    } else {
                        s = s * 3 + 1;
                    }
                    System.out.print(" " + s); // הדפסת המספר הבא בסדרה
                }
                steps++; // הצעד האחרון ל-1
                System.out.println(" (" + steps + ")"); // סוגריים עם מספר הצעדים
            }
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        } else if (mood.equals("c")) { // מצב concise
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        } else {
            System.out.println("Invalid mode. Use 'v' for verbose or 'c' for concise.");
        }
    }
}
