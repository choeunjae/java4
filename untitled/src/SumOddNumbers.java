import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        System.out.println("숫자를 입력하세요: ");

        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("홀수의 합: " + sum);
    }
}