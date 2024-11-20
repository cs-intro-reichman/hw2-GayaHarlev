// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // המספר עד אליו נחשב רצפי Collatz
        boolean verbose = args.length > 1 && args[1].equalsIgnoreCase("v"); // מצב verbose
        
        // לולאה חיצונית לכל המספרים מ-1 עד n
        for (int i = 1; i <= n; i++) {
            int current = i;
            int count = 0; // סופר את אורך הרצף
            StringBuilder sequence = new StringBuilder(); // לבניית הרצף
            
            // לולאת Collatz
            while (true) {
                sequence.append(current); // הוספת המספר הנוכחי לרצף
                count++; // עדכון האורך
                
                if (current == 1) break; // אם הגענו ל-1, מסיימים
                
                sequence.append(" "); // הוספת רווח בין המספרים
                
                if (current % 2 == 0) {
                    current = current / 2; // אם זוגי, חילוק ב-2
                } else {
                    current = 3 * current + 1; // אם אי-זוגי, כפול 3 + 1
                }
            }
            
            // הדפסת הרצף אם verbose מופעל
            if (verbose) {
                System.out.println(sequence + " (" + count + ")");
            }
        }
        
        // הודעת סיום
        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
