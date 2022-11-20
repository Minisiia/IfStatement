import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int numberIf1 = scanner.nextInt();
        if (numberIf1 > 0) {
            numberIf1++;
        }
        System.out.println(numberIf1);
    }
}
