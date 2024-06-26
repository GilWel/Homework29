import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();

        Set<String> workDays = new HashSet<>();
        Set<String> weekends = new HashSet<>();
        weekends.add("Sunday");
        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");
        weekends.add("Saturday");

            if (workDays.contains(workDays)){
                System.out.println("рабочий день");
        }
            else {
                System.out.println("выходной день");
            }
    }
}
