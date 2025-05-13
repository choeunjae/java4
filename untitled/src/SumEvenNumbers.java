public class SumEvenNumbers {
    public static void main(String[] args) {

        //합계를 저장할 변수 초기화
        int sum = 0;

        //모든 수를 검사하고 짝수만 더하는 방법
        for (int i = 1; i <= 1000; i++) {
            //짝수인지 확인 (2로 나눈 나머지가 0)
            if (i % 2 == 0) {
                sum += i; //짝수인 경우에만 합계에 더함
            }
        }

        //결과 출력
        System.out.println("1부터 1000까지 짝수의 합: " + sum);
    }
}