public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // הגבול העליון של הזרעים
        String mode = args[1]; // מצב (verbose או concise)

        if (!mode.equals("v") && !mode.equals("c")) {
            System.out.println("Invalid mode. Use 'v' for verbose or 'c' for concise.");
            return;
        }

        // מצב verbose
        if (mode.equals("v")) {
            for (int seed = 1; seed <= n; seed++) {
                int steps = 0;
                int current = seed;

                // הדפסת הרצף
                System.out.print(current);
                while (current != 1) {
                    steps++;
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = current * 3 + 1;
                    }
                    System.out.print(" " + current);
                }
                System.out.println(" (" + (steps + 1) + ")");
            }
        }

        // מצב concise
        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
