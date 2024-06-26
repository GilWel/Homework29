import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer integer = scanner.nextInt();
            for (int i = 0; i < 5; i++) {
                set.add(scanner.nextInt());

            }
            if (set.size() != 1) {
                System.out.println("Yes");

            }

        }
    }
}
