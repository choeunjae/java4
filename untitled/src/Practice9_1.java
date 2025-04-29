import java.util.Scanner;

public class Practice9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = 0;

        System.out.print("입력: ");
        num = sc.nextInt();

        System.out.println(num);

        if (1<=num && num<=100) {
            System.out.println("출력: 1에서 100 사이의 값입니다.");
        } else {
            System.out.println("출력: 1에서 100 사이의 값이 아닙니다.");
        }

    }
}