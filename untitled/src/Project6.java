import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        System.out.println("시험 점수는 몇 점입니까? ");
        score = sc.nextInt();


        if (score >= 85) {
            System.out.println("A 입니다.");
        } else {
            System.out.println("B 입니다.");
        }
    }
}