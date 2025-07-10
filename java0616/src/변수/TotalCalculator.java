package 변수;

import java.util.Scanner;

public class TotalCalculator {
    public static void main(String[] args) {
        int total = 30;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a 또는 b 중 하나의 값을 입력하세요 (입력하지 않을 변수에는 -1을 입력): ");
        System.out.print("\na 입력: ");
        int a = scanner.nextInt();

        System.out.print("b 입력: ");
        int b = scanner.nextInt();

        if (a == -1 && b != -1) {
            a = total - b;
            System.out.println("계산된 a의 값은: " + a);
        } else if (b == -1 && a != -1) {
            b = total - a;
            System.out.println("계산된 b의 값은: " + b);
        } else if (a != -1 && b != -1) {
            if (a + b == total) {
                System.out.println("a + b = total이 맞습니다.");
            } else {
                System.out.println("a + b != total. 다시 입력하세요.");
            }
        } else {
            System.out.println("a 또는 b 둘 중 하나는 입력해야 합니다.");
        }

        scanner.close();
    }
}