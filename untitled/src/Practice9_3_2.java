import java.util.Scanner;

public class Practice9_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");

        int score = scanner.nextInt();
        String grade = "A, B, C, D, F";

        if (score <= 100 && score >= 0) {
            switch (score / 10) {
                case 10, 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
                    return;
            }
        } else {
            System.out.print("잘못된 점수를 입력하셨습니다.");
            return;
        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}