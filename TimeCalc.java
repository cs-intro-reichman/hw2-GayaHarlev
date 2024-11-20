public class TimeCalc {
    public static void main(String[] args) {
        // קליטת הקלט משורת הפקודה
        String time = args[0]; // השעה בפורמט hh:mm
        int minutesToAdd = Integer.parseInt(args[1]); // ממיר את מספר הדקות למספר שלם

        // שימוש ב-substring לחילוץ השעות והדקות
        int hours = Integer.parseInt(time.substring(0, 2)); // השעות
        int minutes = Integer.parseInt(time.substring(3, 5)); // הדקות

        // חישוב סך כל הדקות
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;

        // חישוב השעה והדקות החדשות
        int newHours = (totalMinutes / 60) % 24; // חלוקה ב-60 ואז מודולו 24 לשעה החדשה
        int newMinutes = totalMinutes % 60; // שארית מהחלוקה ב-60 לדקות החדשות

        // עיצוב הפלט עם אפסים מובילים
        String formattedHours = (newHours < 10) ? "0" + newHours : String.valueOf(newHours);
        String formattedMinutes = (newMinutes < 10) ? "0" + newMinutes : String.valueOf(newMinutes);

        // הדפסת התוצאה
        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
