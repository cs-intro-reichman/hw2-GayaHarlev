// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int maxSeed = Integer.parseInt(args[0]); // המספר עד אליו נחשב רצפי Collatz
        String mode = args[1]; // מצב העבודה: verbose או concise
        
        // בדיקה אם מצב verbose
        boolean verbose = mode.equals("v");
        
        // לולאה חיצונית לכל המספרים מ-1 עד maxSeed
        for (int seed = 1; seed <= maxSeed; seed++) {
            int current = seed;
            int steps = 0; // סופר את אורך הרצף
            StringBuilder sequence = new StringBuilder(); // לבניית הרצף
            
            // לולאת Collatz עבור המספר הנוכחי
            while (true) {
                sequence.append(current); // הוספת המספר הנוכחי לרצף
                steps++; // עדכון מספר הצעדים
                
                if (current == 1) break; // אם הגענו ל-1, מסיימים
                
                sequence.append(" "); // הוספת רווח בין המספרים
                
                if (current % 2 == 0) {
                    current = current / 2; // אם המספר זוגי, חילוק ב-2
                } else {
                    current = 3 * current + 1; // אם המספר אי-זוגי, כפול 3 + 1
                }
            }
            
            // אם מצב verbose, מדפיסים את הרצף והצעדים
            if (verbose) {
                System.out.println(sequence + " (" + steps + ")");
            }
        }
        
        // הודעת סיכום
        System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
    }
}
