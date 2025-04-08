public class Project5 {

    public static void main(String[] args) {
        //국어, 영어, 수학, 과학 변수선언
        int kor = 85;
        int eng = 92;
        int mat = 78;
        int sci = 95;

        //int sum = 0;
        //int intAvg = 0;
        //double doubleAvg = 0.0;
        boolean boolRslt = false;

        //1. 정수 나눗셈으로 평균 계산 (소수점 손실)
        int count = 4;
        int sum = kor + eng + mat + sci;
        int intAvg = sum / count;

        //형변환 없는 정수 평균 계산
        System.out.println("=== 형변환 없는 평균 계산 ===");
        System.out.println("총점: " + sum);
        System.out.println("정수 나눗셈 평균: " + intAvg);

        //2. 형변환을 사용한 정확한 평균 계산
        double doubleAvg = (double) sum / count;

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