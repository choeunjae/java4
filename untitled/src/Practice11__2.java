import java.util.Scanner;

public class Practice11__2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("점수를 입력하세요 (종료하려면 음수를 입력): ");

            num = scanner.nextInt();

            if (0 <= num) {
                sum += num;
            }

            else if (num < 0)
                break;
        }

            System.out.println("점수의 총합은: " + sum);
        }
    }