import java.util.Scanner;

public class PemilihanHari10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dayName, dayType;
        
        System.out.println("Masukkan day name");
        dayName = input.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thrusday":
            case "friday":
                dayType = "weekday";
                break;
            case "sunday":
            case "saturday":
                 dayType = "weekend";
                 break;
            default:
                dayType = "invalid name";
        }

        System.out.println(dayName + " adalah " + dayType);
    }
}
