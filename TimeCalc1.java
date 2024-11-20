public class TimeCalc1 {
    public static void main(String[] args) {
      
        String time = args[0]; 
        int minutesToAdd = Integer.parseInt(args[1]); 

        
        int hours = Integer.parseInt(time.substring(0, 2)); // השעות
        int minutes = Integer.parseInt(time.substring(3, 5)); // הדקות

        // חישוב הדקות
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;

        // חישוב השעה והדקות 
        int newHours = (totalMinutes / 60) % 24; // חישוב שעה לפי הנוסחה הנתונה
        int newMinutes = totalMinutes % 60; // חישוב דקות לפי הנוסחה

        String formattedHours = (newHours < 10 ? "0" + newHours : "" + newHours);
        String formattedMinutes = (newMinutes < 10 ? "0" + newMinutes : "" + newMinutes);

        // הדפסה
        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
