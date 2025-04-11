import java.util.Scanner;

public class Project5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //국어, 영어, 수학, 과학 변수선언
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sci = 0;

        int sum = 0;
        int intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;

        System.out.println("국어 점수를 입력하세요: ");
        kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요: ");
        eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요: ");
        mat = sc.nextInt();
        System.out.println("과학 점수를 입력하세요: ");
        sci = sc.nextInt();

        //1. 정수 나눗셈으로 평균 계산 (소수점 손실)
        int count = 4;
        sum = (sci + eng + mat + sci);
        intAvg = sum / count;

        //형변환 없는 정수 평균 계산
        System.out.println("=== 형변환 없는 평균 계산 ===");
        System.out.println("총점: " + sum);
        System.out.println("정수 나눗셈 평균: " + intAvg);

        //2. 형변환을 사용한 정확한 평균 계산
        doubleAvg = (double) sum / count;

        System.out.println("\n=== 형변환을 사용한 평균 계산 ===");
        System.out.println("실수 나눗셈 평균: " + doubleAvg);
        System.out.printf("소수점 둘째 자리까지: %.2f\n", doubleAvg);

        //3. 자료형 논리 비교
        System.out.println("\n=== 자료형 논리 비교 ===");

        //정수형과 실수형 평균 비교
        System.out.println("정수평균 == 실수평균? "+  (intAvg == doubleAvg));

        //추가 비교
        boolRslt = doubleAvg >= 80;
        System.out.println("평균 80점 이상 합격 여부: " + (boolRslt ?"합격" : "불합격"));
    }
}