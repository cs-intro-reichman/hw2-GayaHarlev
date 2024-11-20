// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        // בדיקת קלט
        int n = Integer.parseInt(args[0]);

        // הדפסת המספר ההתחלתי
        System.out.println(n);

        // לולאה להדפסת המספרים ברצף
        while (n != 1) {
            if (n % 2 == 0) {
                // אם המספר זוגי, חילוק ב-2
                n = n / 2;
            } else {
                // אם המספר אי-זוגי, הכפלה ב-3 והוספת 1
                n = 3 * n + 1;
            }
            System.out.println(n); // הדפסת המספר הבא ברצף
        }
    }
}
