// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int repeatCount = Integer.parseInt(args[1]);
            word = word.toUpperCase();

            for (int i = 0; i < word.length(); i++) {
               char letter = word.charAt(i);
               String article;

               if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || 
                letter == 'I' || letter == 'L' || letter == 'M' || letter == 'N' || 
                letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X') {
                article = "an";
                System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
            } else {
                article = "a";
                System.out.println("Give me " + article + "  " + letter + ": " + letter + "!");
            }

            
        }

        System.out.println("What does that spell?");
        for (int i=0; i<repeatCount; i++) {
                System.out.println(word + "!!!");
        }


                
            }



        }

