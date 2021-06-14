import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStreamReader is = new InputStreamReader(System.in);

         BufferedReader reader = new BufferedReader(is);
        int numberOfRows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRows; i++) {
            String temp = scanner.nextLine();
            Box<String> box = new Box<>(temp);
            System.out.println(box);
        }
    }
}
